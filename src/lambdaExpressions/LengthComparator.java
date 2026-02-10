package lambdaExpressions;

import java.util.Comparator;
//Example Implementation without Lambda expression

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
