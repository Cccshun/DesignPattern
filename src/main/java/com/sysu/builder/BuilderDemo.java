package com.sysu.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println(vegMeal.getCost());
        vegMeal.showItems();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println(nonVegMeal.getCost());
        nonVegMeal.showItems();
    }
}

class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}

class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float totalCost = 0.0f;
        for (Item item : items) {
            totalCost += item.price();
        }
        return totalCost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.printf("Item: {%s}, Packing: {%s}, Price: {%.2f}\n", item.name(), item.packing().pack(), item.price());
        }
    }
}
