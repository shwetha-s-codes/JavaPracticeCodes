package basics;

public class TypeCasting {
    public static void main(String[] args)
    {
        //implict
        double a=1+2.0; //int to double
        System.out.println(a);
        //explicit
        int b=(int)a+1;
        System.out.println(b);
        //Wrapper Classes for non compatible Conversions
        String x="1";
        int y=Integer.parseInt(x)+1;
        System.out.println(y);
        String m="1.1";
        Double n=Double.parseDouble(m)+5;
        System.out.println(m+" "+n);


    }
}
