package model.classes;

import model.enums.PaymentType;

public class Payment {
    private double price;
    private PaymentType paymentType;

    public Payment(double price, PaymentType paymentType) {
        this.price = price;
        this.paymentType = paymentType;
    }
}
