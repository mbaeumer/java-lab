package se.mbaeumer.javalab.streamdemo.nestedloops;

import java.util.ArrayList;
import java.util.List;

public class CarWheelDataSource {
    private List<Car> cars;

    private List<Wheel> wheels;

    public void init(){
        initCars();
        initWheels();
    }

    private void initCars(){
        cars = new ArrayList<>();

        Car car = new Car("blue");
        cars.add(car);
        car = new Car("black");
        cars.add(car);
        car = new Car("gray");
        cars.add(car);
        car = new Car("green");
        cars.add(car);
        car = new Car("red");
        cars.add(car);
    }

    private void initWheels(){
        wheels = new ArrayList<>();

        Wheel wheel = new Wheel("white", true);
        wheels.add(wheel);
        wheel = new Wheel("red", true);
        wheels.add(wheel);
        wheel = new Wheel("red", false);
        wheels.add(wheel);
        wheel = new Wheel("blue", true);
        wheels.add(wheel);
        wheel = new Wheel("green", true);
        wheels.add(wheel);
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }
}
