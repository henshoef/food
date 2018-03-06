package com.example.android.foodstore;

import java.io.Serializable;

/**
 * Created by Android on 06/03/2018.
 */

public abstract class Food implements Serializable{
    private int price;
    private int cookTime;
    private int calories;


    public Food(int price, int cookTime, int calories) {
        this.price = price;
        this.cookTime = cookTime;
        this.calories = calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCookTime() {
        return cookTime;
    }

    public void setCookTime(int cookTime) {
        this.cookTime = cookTime;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
