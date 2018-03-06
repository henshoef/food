package com.example.android.foodstore;

/**
 * Created by Android on 06/03/2018.
 */


public class Chips extends Food {
   private ChipShape shape;
  private   ChipsKind kind;

    public Chips(int price, int cookTime, int calories, ChipShape shape,ChipsKind kind) {
        super(price, cookTime, calories);
        this.shape = shape;
        this.kind =kind;
    }

    public ChipShape getShape() {
        return shape;
    }

    public void setShape(ChipShape shape) {
        this.shape = shape;
    }

    public ChipsKind getKind() {
        return kind;
    }

    public void setKind(ChipsKind kind) {
        this.kind = kind;
    }
}
