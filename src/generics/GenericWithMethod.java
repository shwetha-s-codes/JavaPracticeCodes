package generics;
//We can have a generic method inside a non-generic class

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenericWithMethod {
    private static  final Logger log= LoggerFactory.getLogger(GenericWithMethod.class);
    public <T> void setItem(T item)
    {
        T genericItem;
        genericItem=item;
        log.debug("Item is {}",genericItem);

    }

}
