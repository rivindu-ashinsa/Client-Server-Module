/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.socketlearningproject.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleSocketClient {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world");
        String serverAddress = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(serverAddress, port)) {
            System.out.println("Connected to the server");
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in); 
            
            while (true){
                System.out.print("You: ");
                String message = scanner.nextLine(); 
                
                out.println(message);
                String response = in.readLine(); 
                System.out.println("server:" + response);
                
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
