/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import dip.lab3.*;

/**
 *
 * @author Gladwin
 */
public class Startup {
    public static void main(String args[]){
        
        InputManager input=new KeyboardInputManager();
        OutputManager output=new ConsoleOutputManager();
        
        String line=input.readln();
        output.writeln(line);
        
        MessageService service = new MessageService(input, output);
        service.copy();
        
        System.out.println("Program ended. Line of reader input copied successfully to writer output.");
    }
    
   }

