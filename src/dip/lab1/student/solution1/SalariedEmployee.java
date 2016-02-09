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

   
public class SalariedEmployee implements Employee {
    private double annualSalary;
    private double annualBonus;

    
    /**
     * Custom constructor. This is better because we guarantee
     * property initialization.
     * @param annualSalary - the employee's annual salary
     * @param annualBonus - a bonus benefit, if any
     */
    public SalariedEmployee(double annualSalary, double annualBonus) {
        setAnnualSalary(annualSalary);
        setAnnualBonus(annualBonus);
    }

    /* Custom implementation of Inteface contract. Therefore, this method
     * is polymorphic (common) to all employess and can be used in the
     * high-level class. The other methods are not part of the contract and
     * therefore can't be used in the high-level class.
     */
    public double getAnnualWages() {
        return annualSalary + annualBonus;
    }

    public double getAnnualBonus() {
        return annualBonus;
    }

    public void setAnnualBonus(double annualBonus) {
        this.annualBonus = annualBonus;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    
}
