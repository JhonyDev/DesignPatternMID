package com.assignment;

public class SandwichMealBuilder implements MealBuilder {
    private final Meal meal = new Meal();

    @Override
    public void addSandwich(String str) {
        meal.sandwich = str;
    }

    @Override
    public void addSides(String str) {
        meal.sidesOrder = str;
    }

    @Override
    public void addDrink(String str) {
        meal.drink = str;
    }

    @Override
    public void addOffer(String str) {
        meal.offer = str;
    }

    @Override
    public void setPrice(double str) {
        meal.price = str;
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
