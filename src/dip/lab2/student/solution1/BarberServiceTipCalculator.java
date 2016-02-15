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
//
public class BarberServiceTipCalculator implements TipCalculator{
    private static  double MIN_BILL = 0.00;// likely to change
    private static double MAX_BILL = 100.00;// likely to change
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static  double GOOD_RATE = 0.20;//likely to change
    private static  double FAIR_RATE = 0.15;//likely to change
    private static  double POOR_RATE = 0.10;//likely to change

    private double baseTipPerHeadCount;
    private double bill;


    @Override
    public double getCalculatedTip() {
         double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                tip = baseTipPerHeadCount  * bill * (1 + GOOD_RATE);
                break;
            case FAIR:
                tip = baseTipPerHeadCount  * bill * (1 + FAIR_RATE);
                break;
            case POOR:
                tip = baseTipPerHeadCount  * bill * (1 + POOR_RATE);
                break;
        }

        return tip;
  
      
    }
   
    private ServiceQuality serviceQuality;
    private double tipAmount;
    public BarberServiceTipCalculator(ServiceQuality q,double tipAmount) {
        this.setServiceRating(q); // perform validation
        this.setBillAmount(tipAmount);

        baseTipPerHeadCount = 1.00; // set default value
    }
    
     public final void setBillAmount(double tipAmount) {
        if(tipAmount < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = tipAmount;
    }
   
       public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    /*public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }*/

    public double getBaseTipPerHeadCount() {
        return baseTipPerHeadCount;
    }

    public void setBaseTipPerHeadCount(double baseTipPerHeadCount) {
        if(baseTipPerHeadCount < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerHeadCount = baseTipPerHeadCount;
    }

}

