package streams;

import java.util.Arrays;
import java.util.OptionalInt;
//Program to find Maximum odd number

public class MaxOdd {
    public static void main(String[] args) {
        int arr[]={17,221,56};
        int res=Arrays.stream(arr).filter(n->(n%2!=0)).max().getAsInt();
        System.out.println("Maximum odd Nimber is "+res);

    }
}
