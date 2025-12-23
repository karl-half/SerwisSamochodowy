package model.enums;

public enum PaymentType {
    MONEY("Gotówka"),
    BLIK("Blik"),
    CARD("Karta płatnicza");

    private String name;

    PaymentType(String name) {
        this.name = name;
    }
}
