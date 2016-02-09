/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;
import java.text.NumberFormat;

/**
 *
 * @author Gladwin
 */
public class Startup {
    
 public static void main(String[] args) {
        //Low-level modules
        Employee emp1 = new HourlyPlusIncentiveEmployee(10.50, 2020);
        Employee emp2 = new SalariedEmployee(45000, 1250);
        Employee emp3 = new SalariedEmployee(90000,0);
        
        // Create a collection that we can process as a group --
        // demands polymorphic behavior
        Employee[] employees = {emp1, emp2, emp3};

        // High-level module
        HRService hr = new HRService();

        // Just utility code to format numbers nice.
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        // Test input/output by looping over collection in a way that
        // doesn't break if we add/subtract employees from array
        for(int i=0; i < employees.length; i++) {
            System.out.println("Employee " + (i+1) + " compensation:" +
            nf.format(hr.getAnnualCompensationForEmployee(employees[i])));
        }

    }
}






