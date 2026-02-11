# Client-Server Programming Tutorials

This repository contains Java tutorials demonstrating client-server communication patterns using sockets and basic messaging systems. The projects are built with Maven and use Java 17+.

## 📁 Project Structure

```
ClientServer/
├── Tutorial1/                     # Basic message passing system
├── Tutorial-week03-socket1/       # Simple client-server socket communication
└── Tutorial-week03-socket2/       # Raw byte stream chat application
```

## 🚀 Projects Overview

### 1. Tutorial1 - Message Passing System

A basic demonstration of message passing between sender and receiver components using logging.

**Key Components:**
- `Sender.java` - Creates and sends messages
- `Receiver.java` - Receives and processes messages
- `Message.java` - Message data structure
- `Tutorial1.java` - Main application entry point

**Features:**
- Simple message creation and transmission
- Logging with Java's built-in Logger
- Exception handling for message operations

**Run:**
```bash
cd Tutorial1
mvn clean compile
mvn exec:java
```

---

### 2. Tutorial-week03-socket1 - TCP Socket Communication

Demonstrates basic TCP client-server communication with `BufferedReader` and `PrintWriter`.

**Key Components:**
- `Server.java` - TCP server listening on port 12345
- `Client.java` - TCP client connecting to the server

**Features:**
- Text-based communication using BufferedReader/PrintWriter
- Server accepts client connections in an infinite loop
- Simple request-response pattern
- Automatic resource management with try-with-resources

**Run:**

Terminal 1 (Server):
```bash
cd Tutorial-week03-socket1
mvn clean compile
mvn exec:java -Dexec.mainClass="com.mycompany.tutorial.week03.socket1.Server"
```

Terminal 2 (Client):
```bash
cd Tutorial-week03-socket1
mvn exec:java -Dexec.mainClass="com.mycompany.tutorial.week03.socket1.Client"
```

**Expected Output:**
- Client sends: "Hello from client"
- Server responds: "Hello from server"

---

### 3. Tutorial-week03-socket2 - Raw Stream Chat Application

An interactive chat application using raw byte streams (InputStream/OutputStream).

**Key Components:**
- `SimpleChatServer.java` - Server handling raw byte streams on port 5000
- `SimpleChatClient.java` - Interactive client with continuous message exchange

**Features:**
- Raw byte-level communication
- Interactive console-based chat
- Server echoes received messages with confirmation
- Continuous message loop on client side
- 1024-byte buffer for message transmission

**Run:**

Terminal 1 (Server):
```bash
cd Tutorial-week03-socket2
mvn clean compile
mvn exec:java -Dexec.mainClass="com.mycompany.tutorial.week03.socket2.SimpleChatServer"
```

Terminal 2 (Client):
```bash
cd Tutorial-week03-socket2
mvn exec:java -Dexec.mainClass="com.mycompany.tutorial.week03.socket2.SimpleChatClient"
```

**Usage:**
1. Start the server first
2. Launch the client
3. Type messages at the "You: " prompt
4. Server will echo back with "Server received your message: [your message]"

---

## 🛠️ Prerequisites

- **Java Development Kit (JDK)**: Version 17 or higher (Tutorial1 uses Java 25)
- **Apache Maven**: Version 3.6+ for dependency management and builds
- **IDE** (Optional): NetBeans, IntelliJ IDEA, Eclipse, or VS Code

## 📦 Installation

1. Clone the repository:
```bash
git clone <repository-url>
cd ClientServer
```

2. Build all projects:
```bash
# Build Tutorial1
cd Tutorial1
mvn clean install

# Build socket1
cd ../Tutorial-week03-socket1
mvn clean install

# Build socket2
cd ../Tutorial-week03-socket2
mvn clean install
```

## 🎓 Learning Objectives

These tutorials cover:

1. **Basic Networking Concepts**
   - Client-server architecture
   - TCP/IP socket programming
   - Port binding and connection establishment

2. **Java I/O Streams**
   - Buffered character streams (BufferedReader/PrintWriter)
   - Raw byte streams (InputStream/OutputStream)
   - Stream conversion and encoding

3. **Exception Handling**
   - IOException management
   - Resource cleanup with try-with-resources
   - Network error handling

4. **Multi-threading Concepts** (Implicit)
   - Blocking I/O operations
   - Server accept loops
   - Client-server synchronization

## 🔍 Key Concepts Demonstrated

### Socket Communication Flow

```
1. Server creates ServerSocket and binds to port
2. Server calls accept() - blocks waiting for client
3. Client creates Socket and connects to server
4. Connection established - both get Socket object
5. Data exchange via input/output streams
6. Resources cleaned up and sockets closed
```

### BufferedReader vs Raw Streams

- **BufferedReader/PrintWriter**: Line-based text communication, automatic buffering, easy string handling
- **Raw Streams**: Byte-level control, custom protocols, manual buffer management

## 📝 Notes

- **Port Numbers**: 
  - Tutorial-week03-socket1 uses port `12345`
  - Tutorial-week03-socket2 uses port `5000`
- **Localhost**: All examples use `localhost` (127.0.0.1) for local testing
- **Single Client**: Current implementations handle one client at a time (no multi-threading)
- **TODOs**: Code contains numbered TODO comments for educational purposes

## 🐛 Troubleshooting

**Port Already in Use:**
```bash
# Find process using the port (Windows)
netstat -ano | findstr :12345

# Kill the process
taskkill /PID <process-id> /F
```

**Connection Refused:**
- Ensure the server is running before starting the client
- Check firewall settings
- Verify correct port numbers

**Maven Build Errors:**
- Ensure JAVA_HOME is set correctly
- Update Maven: `mvn -version`
- Clean rebuild: `mvn clean install -U`

## 📚 Further Learning

To extend these tutorials, try:
- Implementing multi-threaded servers to handle multiple clients
- Adding protocol buffers or JSON for structured data
- Implementing graceful shutdown mechanisms
- Adding authentication and encryption (SSL/TLS)
- Creating a GUI client with JavaFX or Swing

## 📄 License

Educational project - free to use and modify.

## 👤 Author

Created for learning purposes as part of networking and distributed systems coursework.

---

**Happy Coding! 🚀**
