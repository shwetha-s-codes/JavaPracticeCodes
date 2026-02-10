package lambdaExpressions;

public class Main {
    public static void main(String[] args) {
        var noparameter=new Noparameter();
        noparameter.display(()-> System.out.println("I am no parameter Lambda Expression"));
    }
}
