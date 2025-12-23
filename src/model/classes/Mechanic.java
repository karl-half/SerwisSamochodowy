package model.classes;

public class Mechanic {
    private String name;
    private String surname;
    private int age;
    private String specialisation;

    public Mechanic(String name, String surname, int age, String specialisation) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.specialisation = specialisation;
    }

    @Override
    public String toString() {
        return "Mechanik: Imię - " + name + ", Nazwisko - " + surname + ", Wiek - " + age + ", Specjalizacja - " + specialisation;
    }
}
