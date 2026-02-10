package lambdaExpressions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoParameterMain {
    public static final Logger log= LoggerFactory.getLogger(NoParameterMain.class);

    public static void main(String[] args) {
        Noparameter np=new Noparameter();
        PrintInformation p;
        //Example where lambda expression is passed to another method
        np.Example(()->"I am no Parameter Lambda Expression");//PrintInformation interface returns a string
        //Alternative way without any class or methods without passing lambda as a parameter
        PrintInformation p2=()->"I am no Parameter Lambda Expression";
        log.info(p2.display());
    }

}
/*
without lambda
class Print implements PrintInformation{
  public String display(){
  return "I am no parameter Lambda Expression"
  }
  }
  Print p=new Print();
  p.display();


*/

