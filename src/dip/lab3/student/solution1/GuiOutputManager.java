/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import dip.lab3.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Gladwin
 */
public class GuiOutputManager implements OutputManager {

    @Override
    public void writeln(String line) {
    
            JOptionPane.showMessageDialog( null,  line);
    
}
}
            
//String response =
  //     JOptionPane.showInputDialog(null, "A Prompt, like enter message here:");
//	}

    
    

