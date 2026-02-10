package lambdaExpressions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Noparameter{
    private static final Logger log=LoggerFactory.getLogger(Noparameter.class);
    public void  Example(PrintInformation p){
        log.info(p.display()); //we need not provide the implementation detail it's obtained through lambda expression

    }
}