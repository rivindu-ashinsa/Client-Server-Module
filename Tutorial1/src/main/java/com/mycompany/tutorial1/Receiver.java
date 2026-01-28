/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */


package com.mycompany.tutorial1;

public class Receiver {
    public void receiveMessage(Message message){
        System.out.println("Message received " + message.getContent());
    }
}
