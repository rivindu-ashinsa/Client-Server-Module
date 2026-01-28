/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutorial1;

/**
 *
 * @author User
 */
public class Tutorial1 {

    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();
        
        Message message = sender.createMessage(new Message("Thi s is my message"));
        sender.sendMessage(receiver, message);
        System.out.println("Message sent");
        
    }
}
