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

    public class HourlyPlusIncentiveEmployee implements Employee {
        
       
    // This class needs properties that the Salaried class does not
    private double hourlyRate;
    private double totalHrsForYear;
    
     
        public HourlyPlusIncentiveEmployee(double hourlyRate, double totalHrsForYear) {
        setHourlyRate(hourlyRate);
        setTotalHrsForYear(totalHrsForYear);
    }
    public final double getAnnualWages() {
        return hourlyRate * totalHrsForYear + 50;
    }
    
    public final double getHourlyRate() {
        return hourlyRate;
    }

    public final void setHourlyRate(double hourlyRate) {
        if(hourlyRate < 0 || hourlyRate > 500) {
            throw new IllegalArgumentException();
        }
        this.hourlyRate = hourlyRate;
    }

    public final double getTotalHrsForYear() {
        return totalHrsForYear;
    }

    public final void setTotalHrsForYear(double totalHrsForYear) {
        if(totalHrsForYear < 0 || totalHrsForYear > 5000) {
            throw new IllegalArgumentException();
        }
        this.totalHrsForYear = totalHrsForYear;
    }    
}


