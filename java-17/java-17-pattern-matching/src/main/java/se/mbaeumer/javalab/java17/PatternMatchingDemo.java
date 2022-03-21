package se.mbaeumer.javalab.java17;

public class PatternMatchingDemo {
    public static String oldSchoolInstanceOf(Vehicle vehicle){
        String result =  null;
        if (vehicle instanceof Car){
            Car car = (Car) vehicle;
            result = car.driveACar();
        }else if (vehicle instanceof Truck){
            Truck truck = (Truck) vehicle;
            result = truck.drive();
        }else if (vehicle instanceof Bike){
            Bike bike = (Bike) vehicle;
            result = bike.ride();
        }

        return result;
    }

    public static String newSchoolInstanceOf(Vehicle vehicle){
        String result = null;
        if (vehicle instanceof Car car){
            result = car.driveACar();
        }else if (vehicle instanceof Truck truck){
            result = truck.drive();
        }else if (vehicle instanceof Bike bike){
            result = bike.ride();
        }

        return result;
    }


    public static String patternMatchingWithSwitch(Vehicle vehicle){
        return switch (vehicle){
            case Car car -> car.driveACar();
            case Truck truck -> truck.drive();
            case Bike bike -> bike.ride();
            default -> null;
        };
    }
}
