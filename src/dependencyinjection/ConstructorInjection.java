package dependencyinjection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Constructor Injection Example
class Engine{
    private static final Logger log= LoggerFactory.getLogger(Engine.class);
    void start(){
        log.info("Engine Started");
    }
}
//In dependency injection we create object outside the class to eliminate tightly coupled classes
class Car
{
    private static final Logger log= LoggerFactory.getLogger(Car.class);
    private final Engine engine; //composition has-a relationship
    Car(Engine engine){
        this.engine=engine;
       // engine.start(); when we think in design and practical application perspective this is a wrong choice .
    }
    void drive()
    {
        engine.start();
        log.info("Engine Started");
    }



}

public class ConstructorInjection {
    public static void main(String[] args) {
        var engine=new Engine();
        var car=new Car(engine);

        car.drive();

    }
}
