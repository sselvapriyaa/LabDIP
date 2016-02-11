/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Gladwin
 */
public class Startup {
     
 
    public static void main(String[] args) {
        
        TipCalculator calc= new FoodServiceTipCalculator(
                                ServiceQuality.GOOD,100);//BarberService
        TipService mgr=new TipService(calc);
        double amt=mgr.getTip();
        System.out.println(amt);
        
        
        calc= new BarberServiceTipCalculator(
                                ServiceQuality.GOOD);//BarberService
        mgr=new TipService(calc);
        double amt1=mgr.getTip();
        System.out.println(amt);
    }
}
