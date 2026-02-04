package conditionalstatements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature:");
        float temperature=sc.nextFloat();
        if(temperature>30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if(temperature>20)
            System.out.println("It's a nice day");
        else
            System.out.println("It's cold");
    }
}
