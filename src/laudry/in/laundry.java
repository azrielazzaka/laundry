/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laudry.in;

import java.awt.Component;

/**
 *
 * @author USER
 */
public class laundry {
    
    public static void main (String[] args, Component center){
        
        login loginframe = new login();
        loginframe.setVisible(true);
        loginframe.pack();
        loginframe.setLocationRelativeTo(center);
    }
}
