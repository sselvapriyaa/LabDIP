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
public class MessageService {
    private InputManager input;
    private OutputManager output;
    
    public MessageService(InputManager input, OutputManager output) {
        this.input = input;
        this.output = output;
    }

    public void setInput(InputManager input) {
        this.input = input;
    }

    public void setOutput(OutputManager output) {
        this.output = output;
    }

    public InputManager getInput() {
        return input;
    }

    public OutputManager getOutput() {
        return output;
    }
    
    

public void copy() {
            String line = input.readln();
            output.writeln( line );
	}
}
