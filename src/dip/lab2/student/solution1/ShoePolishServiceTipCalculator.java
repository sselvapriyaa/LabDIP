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
public class ShoePolishServiceTipCalculator implements TipCalculator {
     private static double MIN_BILL = 0.00;//likely to change
    private static double MAX_BILL = 100.00;//likely to change
    private static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    private static double GOOD_RATE = 0.20;//likely to change
    private static double FAIR_RATE = 0.15;//likely to change
    private static double POOR_RATE = 0.10;//likely to change

    private double baseTipPerBag;
    private int bagCount;
    private double idealSecondsToCompletion;
    private double fee;

    private ServiceQuality serviceQuality;

    public ShoePolishServiceTipCalculator(ServiceQuality q, double idealSecondsToCompletion, double fee) {
        this.setServiceRating(q); // perform validation
        this.idealSecondsToCompletion = idealSecondsToCompletion;

        this.fee = fee;
    }

    @Override
    public double getCalculatedTip() {
        double tip = 0.00; // always initialize local variables

        switch(serviceQuality) {
            case GOOD:
                if(idealSecondsToCompletion < 600) {
                    tip = fee * 2 * (1 + GOOD_RATE);
                } else {
                    tip = fee * (1 + GOOD_RATE);
                }
                break;
            case FAIR:
                if(idealSecondsToCompletion < 1200) {
                    tip = fee * 2 * (1 + GOOD_RATE);
                } else {
                    tip = fee * (1 + GOOD_RATE);
                }
                break;
            case POOR:
                if(idealSecondsToCompletion < 25000) {
                    tip = fee * 2 * (1 + GOOD_RATE);
                } else {
                    tip = fee * (1 + GOOD_RATE);
                }
                break;
        }

        return tip;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    public int getBagCount() {
        return bagCount;
    }

    public final void setBagCount(int bagCount) {
        if(bagCount < 0) {
            throw new IllegalArgumentException(
                    "bag count must be greater than or equal to zero");
        }
        this.bagCount = bagCount;
    }

    public double getBaseTipPerBag() {
        return baseTipPerBag;
    }

    public void setBaseTipPerBag(double baseTipPerBag) {
        if(baseTipPerBag < 0) {
            throw new IllegalArgumentException(
                    "error: base tip must be greater than or equal to zero");
        }
        this.baseTipPerBag = baseTipPerBag;
    }

}


