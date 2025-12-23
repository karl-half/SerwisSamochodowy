package model.classes;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private String registrationNumber;
    private LocalDate purchaseDate;

    public Car(String brand, String model, String registrationNumber, LocalDate purchaseDate) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.purchaseDate = purchaseDate;
    }

    @Override
    public String toString() {
        return "Samochod: Marka - " + brand + ", Model - " + model + ", Numer rejestracyjny - " + registrationNumber + ", Data zakupu - " + purchaseDate;
    }
}
