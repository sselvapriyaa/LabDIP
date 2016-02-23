/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import javax.swing.JOptionPane;
/**
 *
 * @author Gladwin
 */
public class GuiMessageInputStrategy implements MessageInputStrategy {
    
    //String reason=JOptionPane.showInputDialog(“Please Enter Number

    @Override
    public String readln() {
       String name= JOptionPane.showInputDialog("Please enter your name: ");
       return name.concat(" is your name");
       
    }
          
}
