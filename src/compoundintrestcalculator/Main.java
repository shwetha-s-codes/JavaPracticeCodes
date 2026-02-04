package compoundintrestcalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte PERCENT=100;
        System.out.println("---Compound Intrest Calculator---");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        double principalAMount=sc.nextDouble();
        System.out.println("Enter Rate of Intrest (p.a):");
        double rateOfIntrest=sc.nextDouble();
        System.out.println("Enter Time Period in Years");
        int time=sc.nextInt();
        double intrestAmount=principalAMount*(Math.pow((1+rateOfIntrest/PERCENT),time));
        double compoundIntrest=intrestAmount-principalAMount;
        System.out.println("Compound Intrest is:"+compoundIntrest);



    }
}
