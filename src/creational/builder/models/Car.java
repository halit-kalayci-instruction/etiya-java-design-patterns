package creational.builder.models;

public class Car {
    public int seats;
    public double fuel;
    public Engine engine;
    public CarType carType;

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", fuel=" + fuel +
                ", engine=" + engine.power +
                ", carType=" + carType.toString() +
                '}';
    }
}
