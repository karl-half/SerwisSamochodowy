package model.classes;

import java.time.LocalDate;

public class Order {
    private Car car;
    private String carFaultDesc;
    private LocalDate repairDate;
    private boolean isDone;

    public Order(Car car, String carFaultDesc, LocalDate repairDate) {
        this.car = car;
        this.carFaultDesc = carFaultDesc;
        this.repairDate = repairDate;
    }

    public void executeOrder(){
        System.out.println("Wykonano zlecenie");
        isDone = true;
    }

    @Override
    public String toString() {
        return "Zlecenie: Samochod - (" + car + "), Opis usterki - " + carFaultDesc + ", Data naprawy - " + repairDate + ";";
    }
}
