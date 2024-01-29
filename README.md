# Chat Application

This is a simple chat application developed in Java, allowing users to communicate with each other over a network. The application includes a basic graphical user interface (GUI) built using JFrame in NetBeans. Users can log in, and their data is stored in a MySQL database.

## Features

- **User Authentication**: Users can log in securely with their credentials.
- **Database Storage**: User data is stored in a MySQL database.
- **Real-time Communication**: Users can send messages and communicate with each other in real-time.

## File Structure

- **Server**: Contains files related to the server functionality.
  - `server`: Main server file.
  - `Client`: Client-side functionalities.
  - `ClientHandler`: Handles client connections and messages.

- **gui**: Contains GUI-related files.
  - `ChatFrame`: Main chat window.
  - `loginFrame`: Login window.
  - `RegisterFrame`: User registration window.
  - `.forms`: Form files for GUI components.

- **ChatApplication**: Contains application logic.
  - `ChatAppApplication`: Main application class.
  - `DatabaseConnector`: Handles database connections.
  - `DuplicateusernameException`: Exception class for duplicate usernames.
  - `UserManager`: Manages user-related functionalities.

## Getting Started

To run the application, follow these steps:

1. Ensure you have Java Development Kit (JDK) installed on your system.
2. Set up a MySQL database and configure the connection details in `DatabaseConnector`.
3. Open the project in NetBeans or your preferred Java IDE.
4. Locate the server file in your project directory.
5. Run the compiled server file. This file handles the server-side functionality of the chat application, including client connections and message handling.
6. Locate the ChatAppApplication class in the ChatApplication package.
7. Run the compiled ChatAppApplication class. This class represents the main application logic and GUI for the chat application.

## Contributing

Contributions are welcome! If you find any bugs or have suggestions for improvements, please open an issue or create a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

Special thanks to Junaid (my friend) for being my co-developer for this project and also the developers of NetBeans and MySQL for providing the tools necessary to build this application.
