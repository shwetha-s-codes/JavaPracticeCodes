package generics;

public class GenericWithClass<T> {
    T item;
    public void setItem(T item){
        this.item=item;
    }
    public T getItem(){
        return item;
    }


}
