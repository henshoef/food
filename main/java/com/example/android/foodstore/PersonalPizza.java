package com.example.android.foodstore;

import java.util.ArrayList;

/**
 * Created by Android on 06/03/2018.
 */

public class PersonalPizza extends Pizza {
    private int sizeByDiameter;

    public PersonalPizza(int price, int cookTime, int calories, int slices, ArrayList<Toppings> toppings, PizzaShape shape, int sizeByDiameter) {
        super(price, cookTime, calories, slices, toppings, shape);
        this.sizeByDiameter = sizeByDiameter;

    }

    public int getSizeByDiameter() {
        return sizeByDiameter;
    }

    public void setSizeByDiameter(int sizeByDiameter) {
        this.sizeByDiameter = sizeByDiameter;
    }
}
