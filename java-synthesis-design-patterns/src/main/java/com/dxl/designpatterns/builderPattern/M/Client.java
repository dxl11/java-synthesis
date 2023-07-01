package com.dxl.designpatterns.builderPattern.M;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        MealA mealA = new MealA();
        waiter.waiter(mealA);
        Meal construct = waiter.construct();
        System.out.println(construct.getFood()+construct.getDruck());
    }
}
