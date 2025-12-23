package model.classes;

public class Car {
    private String brand;
    private String model;
    private String registrationNumber;

    public Car(String brand, String model, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Samochod: Marka - " + brand + ", Model - " + model + ", Numer rejestracyjny - " + registrationNumber;
    }
}
