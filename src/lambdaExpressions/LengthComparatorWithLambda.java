package lambdaExpressions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class LengthComparatorWithLambda {
    public static final Logger log= LoggerFactory.getLogger(LengthComparatorMain.class);
    public static void main(String[] args) {

        List<String> names=  Arrays.asList("Rani","Vani","Rosie");
        names.sort((s1,s2)->s1.length()-s2.length());
        log.debug("Strings in  Sorted manner as follows{}",names);

    }
}
