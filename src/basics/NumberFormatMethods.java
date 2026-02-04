package basics;

import java.text.NumberFormat;

public class NumberFormatMethods {
    public static void main(String[] args) {
        //NumberFormat is abstract class
        //Number as Currency
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(123));
        //Format as percent
        String percent = NumberFormat.getPercentInstance().format(0.1
        );
        System.out.println(percent);

    }
}
