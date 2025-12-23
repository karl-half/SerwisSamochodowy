package model.classes;

public class Client {
    private String name;
    private String surname;
    private Order order;

    public Client(String name, String surname, Order order) {
        this.name = name;
        this.surname = surname;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", order=" + order +
                '}';
    }
}
