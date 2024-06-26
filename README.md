# Chat App Demo

This project is created for grasping WebSocket technology better in Java/Spring Boot. The project has its own frontend and backend. The technologies used are PostgreSQL, Spring Boot JPA, Lombok, and WebSocket.

## Technologies Used

- PostgreSQL
- Spring Boot
- Spring Boot JPA
- Lombok
- WebSocket

## Setup Instructions

You can use the project in two ways:

### Method 1: Manual Setup

1. **Download and Open the Project**
   - Download the project and open it in your IDE.

2. **Database Setup**
   - Ensure PostgreSQL is running on port 5432.
   - Create a database named `postgres`.
   - Configure the database username and password in the `application.yml` file of the project.

3. **Run the Project**
   - Run the project from your IDE.

4. **Open Frontend**
   - Navigate to the `frontend` folder.
   - Open `index.html` in your browser.

### Method 2: Docker Setup

1. **Docker Compose Setup**
   - Download the Docker Compose file included in the project.
   - Run the Docker Compose file using the command:

     ```
     docker-compose up
     ```

2. **Open Frontend**
   - Download the frontend package from the project.
   - Open `index.html` in your browser.

## Checking WebSocket Functionality

To check if WebSocket technology is working:

1. Open two windows of `index.html`.
2. Select a user in each window.
3. Send a message.
4. The changes should be visible in real-time as WebSocket has been used.

---

Feel free to reach out if you have any questions or issues setting up the project. Enjoy exploring WebSocket technology with this Chat App Demo!
