package compoundintrestcalculator;
//Encapsulation
public class CompoundInterest {
    final byte PERCENT=100;
    double principalAmount;
    float rateOfInterest;
    int time;
    CompoundInterest(double principalAmount, float rateOfInterest, int time)
    {
        this.principalAmount=principalAmount;
        this.rateOfInterest=rateOfInterest;
        this.time=time;
    }
    public double calculateCompoundInterest() {
        double finalAmount=principalAmount*(Math.pow((1+ rateOfInterest /PERCENT),time));
        return finalAmount-principalAmount;
    }



}
