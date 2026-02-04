package basics;

public class MathMethods {
    public static void main(String[] args) {
        int result1= (int) Math.ceil(1.1F);
        System.out.println(result1);
        int result2= (int) Math.floor(1.1F);
        System.out.println(result2);
        //random provides a double we need to explicitly type cast it
        int result3= (int) (Math.random() * 100);
        System.out.println(result3);

    }
}
