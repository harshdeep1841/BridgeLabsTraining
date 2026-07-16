//Abstraction
abstract class Vehicle {

    abstract void start();

    public void stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Started");
    }
}