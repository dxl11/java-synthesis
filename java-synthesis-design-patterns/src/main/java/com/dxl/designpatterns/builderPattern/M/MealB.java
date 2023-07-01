package com.dxl.designpatterns.builderPattern.M;

public class MealB extends MealBuild {
    @Override
    public void mealBuildFood() {
        meal.setFood("一份炸鸡");
    }

    @Override
    public void mealBuildDruck() {
        meal.setDruck("一杯果汁");
    }
}
