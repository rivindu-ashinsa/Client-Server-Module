/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Sender {
    private static final Logger logger = Logger.getLogger(Sender.class.getName());

    public Message createMessage(Message message){
        Message message1 = new Message("This is the message");
        logger.log(Level.INFO, "Message Craeted " + message.getContent());
        return message1; 
    }
    public void sendMessage(Receiver receiver, Message message){
        logger.log(Level.INFO, "Message Sending " + message.getContent());
        receiver.receiveMessage(message);
    }
}
