package main.java.com.itechart.lesson3;

public enum Currency {

    USD("USA dollar"), RUB("Russian ruble");

    private String name;

    Currency(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
