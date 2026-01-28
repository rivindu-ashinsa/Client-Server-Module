/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorial1;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class Tutorial1 {
    private static final Logger logger = Logger.getLogger(Tutorial1.class.getName());

    public static void main(String[] args) {
      
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        
        Message message = sender.createMessage(new Message("Thi s is my message"));
        sender.sendMessage(receiver, message);
        logger.log(Level.SEVERE,"Message sent");
        
    }
}
