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
public class ConsoleOutputManager implements OutputManager {

    @Override
    public void writeln(String line) {
     
            System.out.println("Here is the text you entered, which I've copied below.");
            System.out.println( line );
	}
    }
    
