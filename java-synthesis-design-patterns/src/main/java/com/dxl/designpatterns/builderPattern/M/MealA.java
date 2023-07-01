package com.dxl.designpatterns.builderPattern.M;

public class MealA extends MealBuild{
    @Override
    public void mealBuildFood() {
        meal.setFood("一份薯条");
    }

    @Override
    public void mealBuildDruck() {
        meal.setDruck("一杯可乐");
    }
}
