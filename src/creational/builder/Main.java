package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.builders.ICarBuilder;
import creational.builder.directors.CarDirector;
import creational.builder.models.Car;
import creational.builder.models.CarType;
import creational.builder.models.Engine;

public class Main {
    public static void main(String[] args) {
        /* Car car = new Car();
        car.seats = 4;
        car.fuel = 25.5;
        car.carType = CarType.SUV; */

        Engine engine = new Engine();
        engine.power = 5;


        ICarBuilder carBuilder = new CarBuilder();
        CarDirector carDirector = new CarDirector();
        carDirector.constructSUVCar(carBuilder);
        Car car = carBuilder.createCar();
        System.out.println(car.toString());

    }
}
