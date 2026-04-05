/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.socketlearningproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketServer {

    public static void main(String[] args) throws IOException {
        int port = 5000;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server Intialized at port " + port);
            while (true) {
                Socket client = serverSocket.accept();
                System.out.println("Client Connected at " + client.getInetAddress());
                
                
                ClientHandler clientHandler = new ClientHandler(client); 
                Thread thread = new Thread(clientHandler); 
                thread.start();
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    private static class ClientHandler implements Runnable{
        
        private final Socket clientSocket ; 
        
        public ClientHandler(Socket clientSocket){
            this.clientSocket = clientSocket; 
        }
        
        @Override
        public void run() {
            BufferedReader input = null; 
            PrintWriter output = null; 
            try {
                input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                output = new PrintWriter(clientSocket.getOutputStream(), true); 
                
                String message ; 
                while ((message = input.readLine()) != null){
                    System.out.println("Client: " + message);
                    output.println("echo: " + message);
                    
                }
                
                
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            finally {
                try {
                    // Close everything in reverse order of creation
                    if (input != null) input.close();
                    if (output != null) output.close();
                    if (clientSocket != null) clientSocket.close();

                    System.out.println("Connection closed with client.");

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            
            
        }
        
    }
}
