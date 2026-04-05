/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_based_practical_mock_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ClientSocket {

    public static void main(String[] args) {
        String server = "localhost";
        Integer port = 7000;

        try (Socket socket = new Socket(server, port)) {
            System.out.println("Client Connected to port: " + port);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); 
            
            Scanner scanner = new Scanner(System.in); 
            while (true){
                System.out.print("You: ");
                String message = scanner.nextLine(); 
                out.println(message);
                
                String response = in.readLine(); 
                System.out.println("Response: " + message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
