/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Gladwin
 */
public class Startup {
    public static void main(String args[]){
        InputManager input=new KeyboardInputManager();
        OutputManager output=new GuiOutputManager();
        
        String line=input.readln();
        output.writeln(line);
        
        System.out.println("Program ended. Line of reader input copied successfully to writer output.");
    }
}

