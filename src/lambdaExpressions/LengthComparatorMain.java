package lambdaExpressions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class LengthComparatorMain {
    public static final Logger log= LoggerFactory.getLogger(LengthComparatorMain.class);
    public static void main(String[] args) {
        List<String> names=  Arrays.asList("Rani","Vani","Rosie");
        LengthComparator lc=new LengthComparator();
        names.sort(lc);
        log.debug("Strings in  Sorted manner as follows{}",names);
        //sort function accepts a object of class which implements comparator interface
    }
    //Actual sort code
    //class List<T> {
    //    public void sort(Comparator<T> comparator) {
    //        // "this" refers to the current list object
    //        // I have access to all my own elements!
    //        for (int i = 0; i < this.size(); i++) {
    //            for (int j = i + 1; j < this.size(); j++) {
    //                T first = this.get(i);
    //                T second = this.get(j);
    //
    //                if (comparator.compare(first, second) > 0) {
    //                    // swap them
    //                }
    //            }
    //        }
    //    }
    //}
}
