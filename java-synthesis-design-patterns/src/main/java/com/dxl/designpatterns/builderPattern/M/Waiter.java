package com.dxl.designpatterns.builderPattern.M;

public class Waiter {
    public MealBuild mealBuild;

    public void waiter(MealBuild mealBuild) {
        this.mealBuild = mealBuild;
    }

    public Meal construct() {
        mealBuild.mealBuildDruck();
        mealBuild.mealBuildFood();
        return mealBuild.meal;
    }
}
