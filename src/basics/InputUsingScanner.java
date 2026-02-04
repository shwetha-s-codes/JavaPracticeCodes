package basics;

import java.util.Scanner;

public class InputUsingScanner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name=sc.nextLine();
        System.out.println("Enter your Age");
        byte age=sc.nextByte();
        System.out.println("Name:"+name+"\n"+"Age:"+age);

    }
}
