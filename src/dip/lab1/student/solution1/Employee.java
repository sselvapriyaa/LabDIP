/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab1.student.solution1;

/**
 *
 * @author Gladwin
 */
public interface Employee {
    

    /**
     * Returns annual wages for any type of employee. Note that each
     * specific type of employee will implement this differently. But
     * since all employee sub classes are guaranteed to have this method
     * because of the contractual obligation to re-declare all abstract
     * methods in the sub classes, we are guaranteed to have polymorphic
     * behavior with respect to this method.
     *
     * @return annual wages for an employee
     */
    public abstract double getAnnualWages();


 

}


