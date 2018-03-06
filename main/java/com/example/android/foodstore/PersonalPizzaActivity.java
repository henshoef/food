package com.example.android.foodstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PersonalPizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesonal_pizza);
        getSupportActionBar().hide();
    }
}
