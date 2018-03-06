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
        }else{
            shape=ChipShape.round;
            chipsPrice += 11;
        }
        if(potato.isChecked()){
            kind=ChipsKind.Potato;
            chipsPrice += 5;
        }else{
            kind=ChipsKind.SweeetPotato;
            chipsPrice+=7;
        }

        Food chips=new Chips(chipsPrice,10,500,shape,kind);
        Intent intent=new Intent(this,CheckOutActivity.class);
        intent.putExtra("Food",chips);
        startActivity(intent);
        chipsPrice=0;




    }
    public void onClickCancel(View v){
        this.finish();
    }

}
