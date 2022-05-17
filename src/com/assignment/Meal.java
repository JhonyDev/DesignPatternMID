package com.assignment;

public class Meal {
    String sandwich;
    String sidesOrder;
    String drink;
    String offer;
    String price;

    public Meal() {
    }

    @Override
    public String toString() {
        return "Meal{" +
                "sandwich='" + sandwich + '\'' +
                ", sidesOrder='" + sidesOrder + '\'' +
                ", drink='" + drink + '\'' +
                ", offer='" + offer + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
