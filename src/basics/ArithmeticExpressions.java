package basics;

public class ArithmeticExpressions {
    //basic
    public static void main(String ars[]) {

        //basic
        int x = 1;
        int y = 3;
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
        double div = (double) x / (double) y;
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(div);
        //increment and decrement operators
        System.out.println(x++);
        System.out.println(y--);
        //shorthand methods
        x*=3;
        System.out.println(x);
        y-=2;
        System.out.println(y);


    }

}
