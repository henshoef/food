package com.example.android.foodstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class ChipsActivity extends AppCompatActivity {
    final int cookTime=10;
    int calories=330;
int chipsPrice =0;
ChipShape shape;
ChipsKind kind;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chips);
        getSupportActionBar().hide();
    }
    public void onClickBuy(View v){

        ArrayList<Toppings> toppings = new ArrayList<Toppings>();
        RadioGroup chipsShape=(RadioGroup)findViewById(R.id.chipsShape);
        RadioButton sticks =(RadioButton) findViewById(R.id.sticks);
        RadioButton round =(RadioButton) findViewById(R.id.round);

        RadioButton potato =(RadioButton) findViewById(R.id.potato);
        RadioButton sweetPotato =(RadioButton) findViewById(R.id.sweetPotato);



        if(sticks.isChecked()){
           shape=ChipShape.Sticks;
            chipsPrice += 9;
            calories+=20;
        }else{
            shape=ChipShape.round;
            chipsPrice += 11;

             calories+=100;
        }
        if(potato.isChecked()){
            kind=ChipsKind.Potato;
            chipsPrice += 5;
            calories+=50;
        }else{
            kind=ChipsKind.SweeetPotato;
            chipsPrice+=7;
            calories+=35;
        }

        Food chips=new Chips(chipsPrice,cookTime,calories,shape,kind);
        Intent intent=new Intent(this,CheckOutActivity.class);
        intent.putExtra("Food",chips);
        startActivity(intent);
        chipsPrice=0;
        calories=330;




    }
    public void onClickCancel(View v){
        this.finish();
    }

}
