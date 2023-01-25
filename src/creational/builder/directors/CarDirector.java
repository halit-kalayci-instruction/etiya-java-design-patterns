package creational.builder.directors;

import creational.builder.builders.ICarBuilder;
import creational.builder.models.Car;
import creational.builder.models.CarType;
import creational.builder.models.Engine;

public class CarDirector {
    public void constructSUVCar(ICarBuilder builder){
        Engine suvEngine = new Engine();
        suvEngine.power = 5;
        builder.setEngine(suvEngine);
        builder.setFuel(25);
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
    }
}
