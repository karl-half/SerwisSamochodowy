package model.classes;

import model.enums.PaymentType;
import model.enums.RepairType;

public class Order {
    private Car car;
    private String carFaultDesc;
    private boolean isDone;
    private Mechanic mechanic;
    private RepairType repairType;
    private PaymentType paymentType;

    public Order(Car car, String carFaultDesc, Mechanic mechanic, RepairType repairType, PaymentType paymentType, boolean isDone) {
        this.car = car;
        this.carFaultDesc = carFaultDesc;
        this.mechanic = mechanic;
        this.repairType = repairType;
        this.paymentType = paymentType;
        this.isDone = isDone;
    }

    public void executeOrder(){
        System.out.println("Wykonano zlecenie");
        isDone = true;
    }

    public void orderPayment(){
        System.out.println("Zapłacono za zlecenie za pomocą: " + paymentType);
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @Override
    public String toString() {
        return "Zlecenie: Samochod - (" + car + "), Typ zlecenia - " + repairType + ", Opis zlecenia - " + carFaultDesc + ", Metoda płatności - " + paymentType;
    }
}
