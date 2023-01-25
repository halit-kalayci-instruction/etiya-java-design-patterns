package creational.builder.builders;

import creational.builder.models.Car;
import creational.builder.models.CarType;
import creational.builder.models.Engine;

public class CarBuilder implements ICarBuilder{
    Car car = new Car();

    @Override
    public void setSeats(int seats) {
        if(seats > 4){
            seats = 4;
        }
        car.seats = seats;
    }

    @Override
    public void setFuel(double fuel) {
        car.fuel = fuel;
    }

    @Override
    public void setEngine(Engine engine) {
        car.engine = engine;
    }

    @Override
    public void setCarType(CarType carType) {
        car.carType = carType;
    }

    @Override
    public Car createCar() {
        return car;
    }
}
