/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;
import java.io.*;
/**
 *
 * @author Gladwin
 */
public class FileWriterManager {
    public void writeln(String line) {
		boolean append = false;
		File data = new File(File.separatorChar + "Temp" + 
			  File.separatorChar + "datacopy.txt");
		PrintWriter out = null;
			  
		// This is where we setup our streams (append = false means overwrite)
		// new java.io.FileWriter() creates the file if doesn't exit
		try {
			// make sure we differentiate between java.io.FileWriter
			// class and this custom FileWriter class
			out = new PrintWriter(
						new BufferedWriter(
						new java.io.FileWriter(data, append) ) );
			out.println(line);
			out.close();
			
		} catch (IOException ioe) {
			if(out != null) out.close();
			System.out.println( ioe.getMessage() );
			System.exit(1);  // 1 = signals program end with error
		}

	}

}
