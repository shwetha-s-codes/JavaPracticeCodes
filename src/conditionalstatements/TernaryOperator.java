package conditionalstatements;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Integer greater than 1");
        int number=sc.nextInt();
        String result= number%2==0?"Even":"Odd";
        System.out.println(result);

    }
}
