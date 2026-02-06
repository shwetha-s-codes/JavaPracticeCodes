package generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//Example for Generics here we can create objects with different data types and use same class initialize them

public class Main {
    private static final Logger log =
            LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        GenericWithClass<Integer> p=new GenericWithClass<>();
        p.setItem(10);
        log.debug("Item is {}",p.getItem());
        GenericWithClass<String> p2=new GenericWithClass<>();
        p2.setItem("Apple");
        log.debug("Item is {}",p2.getItem());
        GenericWithMethod item=new GenericWithMethod();
        item.setItem(20);
        item.setItem("Orange");


    }

}
