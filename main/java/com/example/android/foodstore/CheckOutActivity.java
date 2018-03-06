package com.example.android.foodstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.Serializable;

public class CheckOutActivity extends AppCompatActivity {
    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);
        Intent intent=getIntent();
        txt=findViewById(R.id.textView2);
        Serializable food=intent.getSerializableExtra("Food");
        if( food instanceof Pizza ){
            txt.setText(((Pizza)food).getPrice()+"₪");
        }
        if( food instanceof Chips ){
            txt.setText(((Chips)food).getPrice()+"₪");
        }
    }
    public void onClickOrder(View v){

        finish();

    }
    public void onClickCancel(View v){

        finish();

    }
}
