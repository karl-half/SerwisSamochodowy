package model.enums;

public enum RepairType {
    MECHANIC("Mechaniczna"),
    ELECTRONIC("Elektroniczna"),
    VARNISHING("Lakierowanie"),
    REVIEW("Przegląd");

    private String name;

    RepairType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
