package model.classes;

import model.enums.PaymentType;
import model.enums.RepairType;

public class Order {
    private Car car;
    private String carFaultDesc;
    private boolean isDone;
    private boolean isPaid;
    private Mechanic mechanic;
    private RepairType repairType;
    private PaymentType paymentType;

    public Order(Car car, String carFaultDesc, Mechanic mechanic, RepairType repairType, PaymentType paymentType, boolean isDone, boolean isPaid) {
        this.car = car;
        this.carFaultDesc = carFaultDesc;
        this.mechanic = mechanic;
        this.repairType = repairType;
        this.paymentType = paymentType;
        this.isDone = isDone;
        this.isPaid = isPaid;
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

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return "Zlecenie: Samochod - (" + car + "), Typ zlecenia - " + repairType + ", Opis zlecenia - " + carFaultDesc + ", Metoda płatności - " + paymentType + ", Czy wykonane - " + isDone + ", Czy zapłacone - " + isPaid;
    }
}
