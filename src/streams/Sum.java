package streams;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int arr[]={30,20,10};
        //just like in a traditional way stream access every element and perform sum just like a loop
        int sum= Arrays.stream(arr).sum();
        System.out.println(sum);
    }
}
