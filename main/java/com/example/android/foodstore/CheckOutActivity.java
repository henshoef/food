package com.example.android.foodstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class CheckOutActivity extends AppCompatActivity {
    private TextView price;
    private TextView calories;
    private TextView time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        Intent intent=getIntent();
        price =findViewById(R.id.textView2);
        calories =findViewById(R.id.calories);
        time =findViewById(R.id.cookTime);

        Serializable food=intent.getSerializableExtra("Food");
        if( food instanceof Pizza ){
            price.setText(((Pizza)food).getPrice()+"₪");
            calories.setText(((Pizza)food).getCalories()+"");
            time.setText(((Pizza)food).getCookTime()+" minutes");
        }
        if( food instanceof Chips ){
            price.setText(((Chips)food).getPrice()+"₪");
            calories.setText(((Chips)food).getCalories()+"");
            time.setText(((Chips)food).getCookTime()+" minutes");
        }
    }
    public void onClickOrder(View v){

        finish();

    }
    public void onClickCancel(View v){

        finish();

    }
}
