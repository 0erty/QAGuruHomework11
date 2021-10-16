package edu.homework;


public class VehicleRental {

    public String model;
    public String carManufacturer;
    public int maxSpeed;
    public int horsePower;
    public double dayCost;
    public boolean automaticGearBox;
    double finalPrice;

    public VehicleRental(String carManufacturer, String model, int maxSpeed, int horsePower, boolean automaticGearBox) {
        this.carManufacturer = carManufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.horsePower = horsePower;
        this.automaticGearBox = automaticGearBox;

    }

    public double costOfCar() {
        if (model == "Audi" || model == "Mercedes" || model == "BMW") {
            dayCost = 100;
        } else {
            dayCost = 20.5;
        }
        return dayCost;
    }

    public double finalPrice() {
        this.finalPrice = costOfCar() * (maxSpeed/100) + horsePower;
        return this.finalPrice;
    }
}
