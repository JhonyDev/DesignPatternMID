package com.assignment;

public class MealDirector {
    public MealDirector() {
    }

    public void makeMeal(MealBuilder mealBuilder) {
        mealBuilder.addSandwich("Hamburger");
        mealBuilder.addSides("Fries");
        mealBuilder.addDrink("Coke");
        mealBuilder.addOffer("Weekend Bonanza");
        mealBuilder.setPrice(5.99);
    }


}
