package com.dxl.designpatterns.builderPattern.M;

public abstract class MealBuild {
    Meal meal = new Meal();

    public abstract void mealBuildFood();

    public abstract void mealBuildDruck();

    public Meal getMeal() {
        return meal;
    }
}
