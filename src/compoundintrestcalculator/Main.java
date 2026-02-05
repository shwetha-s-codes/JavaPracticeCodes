package compoundintrestcalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("---Compound Interest Calculator---");
        Scanner sc=new Scanner(System.in);


        System.out.print("Enter Principal Amount:");
        double principalAmount=sc.nextDouble();

        System.out.println("Enter Rate of Interest (p.a):");
        float rateOfInterest=sc.nextFloat();


        System.out.println("Enter Time Period in Years");
        int time=sc.nextInt();

        //Usage of Constructors to initialize object
        var ci =new CompoundInterest( principalAmount,rateOfInterest,time);


        System.out.format("Compound Interest is:%.2f%n",ci.calculateCompoundInterest());



    }
}
