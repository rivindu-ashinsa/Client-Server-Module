/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

package com.mycompany.tutorial1;



import java.util.logging.Logger; 
import java.util.logging.Level;


public class Receiver {
    private static final Logger logger = Logger.getLogger(Receiver.class.getName());
    public void receiveMessage(Message message){
        logger.log(Level.INFO, "Message received ", message.getContent());
    }
}
