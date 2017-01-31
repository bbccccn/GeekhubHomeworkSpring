package Entitites;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Car {
    private List<Wheel> wheels;
    private Engine engine;

    @Autowired
    public Car(Engine engine, List<Wheel> wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

/*
    There are following beans:
    Car { wheels, engine }
    Wheel { tyres }
    Engine { engineСapacity }
    Tyres { size, name }
    WinterTyres {} extends Tyres
    SummerTyres {} extends Tyres
*/
