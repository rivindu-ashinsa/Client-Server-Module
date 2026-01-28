/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial1;

/**
 *
 * @author User
 */
public class Sender {
    public Message createMessage(Message message){
        Message message1 = new Message("This is the message");
        System.out.println("Message Created" + message.getContent());
        return message1; 
    }
    public void sendMessage(Receiver receiver, Message message){
        System.out.println("Message Sending");
        receiver.receiveMessage(message);
    }
}
