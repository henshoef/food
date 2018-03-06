package com.example.android.foodstore;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Android on 06/03/2018.
 */

public class Pizza extends Food implements Serializable{
    private   int slices;
    private ArrayList<Toppings> toppings = new ArrayList<Toppings>();
    private  PizzaShape shape;

    public Pizza(int price, int cookTime, int calories, int slices,ArrayList<Toppings> toppings , PizzaShape shape) {
        super(price, cookTime, calories);
        this.slices = slices;
        this.toppings = toppings;
        this.shape = shape;
    }

    public int getSlices() {
        return slices;
    }

    public void setSlices(int slices) {
        this.slices = slices;
    }

    public ArrayList<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<Toppings> toppings) {
        this.toppings = toppings;
    }

    public PizzaShape getShape() {
        return shape;
    }


    public void setShape(PizzaShape shape) {
        this.shape = shape;
    }
}
