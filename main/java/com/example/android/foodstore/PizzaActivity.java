package com.example.android.foodstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class PizzaActivity extends AppCompatActivity {
    int pizzaPrice=40;
    PizzaShape shape;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
 getSupportActionBar().hide();
    }
public void onClickBuy(View v){

    ArrayList<Toppings> toppings = new ArrayList<Toppings>();
    ToggleButton toggleButton=(ToggleButton)findViewById(R.id.shape);
    EditText editText = (EditText)findViewById(R.id.numberOfCuts);
    CheckBox peperonni = (CheckBox)findViewById(R.id.Peperonni);
    CheckBox tuna = (CheckBox)findViewById(R.id.Tuna);
    CheckBox extraCheese = (CheckBox)findViewById(R.id.ExtraCheese);
    CheckBox mushrooms = (CheckBox)findViewById(R.id.Mushrooms);
    CheckBox corn = (CheckBox)findViewById(R.id.Corn);
    CheckBox olives = (CheckBox)findViewById(R.id.Olives);
    Toppings.Peperonni.equals(5);
    Toppings.Tuna.equals(5);
    Toppings.Olives.equals(3);
    Toppings.Mushrooms.equals(4);
    Toppings.Corn.equals(3);
    Toppings.ExtraCheese.equals(5);
    int slices=Integer.parseInt(editText.getText().toString());

    if(peperonni.isChecked()){
        toppings.add(Toppings.Peperonni);
        pizzaPrice=pizzaPrice+5;
    }
    if(tuna.isChecked()){
        toppings.add(Toppings.Tuna);
        pizzaPrice=pizzaPrice+5;
    }
    if(extraCheese.isChecked()){
        toppings.add(Toppings.ExtraCheese);
        pizzaPrice=pizzaPrice+5;
    }
    if(olives.isChecked()){
        toppings.add(Toppings.Olives);
        pizzaPrice=pizzaPrice+3;
    }
    if(mushrooms.isChecked()){
        toppings.add(Toppings.Mushrooms);
        pizzaPrice=pizzaPrice+4;
    }
    if(corn.isChecked()){
        toppings.add(Toppings.Corn);
        pizzaPrice=pizzaPrice+3;
    }
   if(toggleButton.isChecked()){
        shape=PizzaShape.Square;
    }else {
        shape = PizzaShape.Round;
    }
    Food pizza=new Pizza(pizzaPrice,20,700,slices,toppings,shape);
   Intent intent=new Intent(this,CheckOutActivity.class);
   intent.putExtra("Food",pizza);
    startActivity(intent);
    pizzaPrice=40;



    }
    public void onClickCancel(View v){
    this.finish();
    }

}
