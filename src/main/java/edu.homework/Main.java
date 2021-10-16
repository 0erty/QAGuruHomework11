package edu.homework;

public class Main{

    public static void main(String[] args) {
        VehicleRental vehicleRental1 = new VehicleRental("Audi", "A8", 250, 453, true);
        VehicleRental vehicleRental2 = new VehicleRental("Lada", "Vesta", 180, 250, false);
        VehicleRental vehicleRental3 = new VehicleRental("BMW", "X5", 220, 380, true);
        VehicleRental vehicleRental4 = new VehicleRental("Mercedes", "CLA 250", 210, 373, true);
        VehicleRental vehicleRental5 = new VehicleRental("Chevrolet", "Lacetti", 170, 150, false);

        VehicleRental[] vehicleRental = {vehicleRental1, vehicleRental2, vehicleRental3, vehicleRental4, vehicleRental5};

        for (VehicleRental rental : vehicleRental) {
            if (rental.finalPrice() < 300) {
                System.out.println("This " + rental.carManufacturer + " " + rental.model + " is cheap to rent. It costs you " + rental.finalPrice + "$ per day.");
            } else {
                System.out.println("This " + rental.carManufacturer + " " + rental.model + " is expensive to rent. It costs you " + rental.finalPrice + "$ per day.");
            }
        }
    }
}
