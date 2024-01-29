package chatappapplication;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import server.Client;

public class ChatAppApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserManager userManager = new UserManager();

        while (true) {
            System.out.println("Press 1 for Registration, 2 for Login, 0 to Exit:");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": // Registration
                    while (true) {
                        System.out.println("---- Registration ----");
                        System.out.print("Enter a username or 0 to return: ");
                        String registerUsername = scanner.nextLine();

                        if ("0".equals(registerUsername)) break;

                        System.out.print("Enter a password: ");
                        String registerPassword = scanner.nextLine();

                        try {
                            if (userManager.registerUser(registerUsername, registerPassword)) {
                                System.out.println("Registration successful.");
                                break;
                            }
                        } catch (DuplicateUsernameException e) {
                            System.out.println(e.getMessage());
                        } catch (Exception e) {
                            System.out.println("Invalid username or password. Please try again.");
                        }
                    }
                    break;

                case "2": // Login
                    System.out.println("---- Login ----");
                    System.out.print("Enter your username: ");
                    String loginUsername = scanner.nextLine();

                    System.out.print("Enter your password: ");
                    String loginPassword = scanner.nextLine();

                    if (userManager.loginUser(loginUsername, loginPassword)) {
                        System.out.println("Login successful. Connecting to chat server...");
                        connectToChatServer(loginUsername);
                        return; // Exits the program after successful login
                    } else {
                        System.out.println("Invalid username or password for login.");
                    }
                    break;

                case "0": // Exit
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static boolean isValid(String input) {
        return input != null && !input.trim().isEmpty() && input.length() >= 5;
    }

    private static void connectToChatServer(String username) {
        try {
            Socket socket = new Socket("localhost", 1234);
            Client client = new Client(socket, username);
            client.listenForMessage();
            client.sendMessage();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
