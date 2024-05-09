package se.mbaeumer.javalab.streamdemo.nestedloops;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NestedLoopDemo {
    public List<Car> demoOriginal(List<Car> cars, List<Wheel> wheels){
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            for (Wheel wheel : wheels) {
                if (car.getColor().equalsIgnoreCase(wheel.getColor()) &&
                        wheel.isWorking() == true ) {
                    filteredCars.add(car);
                    break;
                }
            }
        }

        return filteredCars;
    }

    public List<Car> demoWithStream(List<Car> cars, List<Wheel> wheels){
        List<Car> filteredCars;

        filteredCars = cars.stream()
                .filter(car -> wheels.stream()
                        .anyMatch(wheel -> wheel.isWorking() && wheel.getColor().equalsIgnoreCase(car.getColor())))
                .collect(Collectors.toList());
        return filteredCars;
    }
}
