package se.mbaeumer.javalab.streamdemo.nestedloops;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NestedLoopDemoTest {

    @Test
    void demoOriginal() {
        NestedLoopDemo demo = new NestedLoopDemo();
        CarWheelDataSource dataSource = new CarWheelDataSource();
        dataSource.init();
        List<Car> filteredCars = demo.demoOriginal(dataSource.getCars(), dataSource.getWheels());
        assertTrue(filteredCars.stream().anyMatch(car -> "red".equals(car.getColor())));
        assertTrue(filteredCars.stream().noneMatch(car -> "black".equals(car.getColor())));
        assertTrue(filteredCars.stream().noneMatch(car -> "gray".equals(car.getColor())));
    }

    @Test
    void demoWithStream() {
        NestedLoopDemo demo = new NestedLoopDemo();
        CarWheelDataSource dataSource = new CarWheelDataSource();
        dataSource.init();
        List<Car> filteredCars = demo.demoWithStream(dataSource.getCars(), dataSource.getWheels());
        assertTrue(filteredCars.stream().anyMatch(car -> "red".equals(car.getColor())));
        assertTrue(filteredCars.stream().noneMatch(car -> "black".equals(car.getColor())));
        assertTrue(filteredCars.stream().noneMatch(car -> "gray".equals(car.getColor())));
    }
}