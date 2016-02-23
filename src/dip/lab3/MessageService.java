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
public class MessageService {
    private MessageInputStrategy input;
    private MessageOutputStrategy output;
    
    public MessageService(MessageInputStrategy input, MessageOutputStrategy output) {
        this.input = input;
        this.output = output;
    }

    public void setInput(MessageInputStrategy input) {
        this.input = input;
    }

    public void setOutput(MessageOutputStrategy output) {
        this.output = output;
    }

    public MessageInputStrategy getInput() {
        return input;
    }

    public MessageOutputStrategy getOutput() {
        return output;
    }
    
    

public void copy() {
            String line = input.readln();
            output.writeln( line );
	}
}
