package se.mbaeumer.javalab.java17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatternMatchingDemoTest {

    @Test
    void oldSchoolInstanceOfCar() {
        Car car = new Car();
        assertTrue("driving a car".equals(PatternMatchingDemo.oldSchoolInstanceOf(car)));
    }

    @Test
    void newSchoolInstanceOf() {
        Car car = new Car();
        assertTrue("driving a car".equals(PatternMatchingDemo.newSchoolInstanceOf(car)));
    }

    /*
    @Test
    void patternMatchingWithSwitch() {
        Car car = new Car();
        assertTrue("driving a car".equals(PatternMatchingDemo.patternMatchingWithSwitch(car)));
    }
     */
}