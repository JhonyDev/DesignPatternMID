package com.assignment;

public interface MealBuilder {
    void addSandwich(String str);

    void addSides(String str);

    void addDrink(String str);

    void addOffer(String str);

    void setPrice(double str);

    Meal getMeal();

}
