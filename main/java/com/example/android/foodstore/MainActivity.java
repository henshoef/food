package com.example.android.foodstore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.Menu;

import android.view.MenuInflater;

import android.view.MenuItem;

import android.widget.LinearLayout;

import android.widget.TextView;


// Note: you can write an onClick event handler in the menu item - in the xml,

// with the event handler implemented here in the MainActivity, but this will cause

// the onOptionsItemSelected not to be called and the event handler to be executed instead.

public class MainActivity extends AppCompatActivity {



    private LinearLayout linearLayoutMain;

    private MenuItem menuItemPizza;

    private MenuItem menuItemChips;

    private MenuItem menuItemPersonalPizza;



    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        linearLayoutMain = (LinearLayout)findViewById(R.id.linearLayout);

    }



    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();

        menuInflater.inflate(R.menu.main_menu, menu);



        // Need to find menu items only here because they belong to the menu and not to the main layout.

        // Also, they are not created yet on the onCreate event:

        menuItemPizza = menu.findItem(R.id.menuItemPizza);

        menuItemChips = menu.findItem(R.id.menuItemChips);

        menuItemPersonalPizza = menu.findItem(R.id.menuItemPersonalPizza);



        return true;

    }



    // Return true to state that the menu event has been handled.

    // Return false to state that the menu event has not been handled.

    public boolean onOptionsItemSelected(MenuItem item) {



        int itemId = item.getItemId();



        if(itemId == R.id.menuItemPizza || itemId == R.id.menuItemChips || itemId == R.id.menuItemPersonalPizza) {

            menuItemPizza.setChecked(false);

            menuItemChips.setChecked(false);

            menuItemPersonalPizza.setChecked(false);

            item.setChecked(true);

        }

        TextView textView=(TextView)findViewById(R.id.textView);

        switch (itemId) {



            case R.id.menuItemPizza:

                textView.setText("You chose Pizza");
                Intent pizza=new Intent(this,PizzaActivity.class);
                getSupportActionBar().setTitle("Pizza");
                startActivity(pizza);

                return true;

            case R.id.menuItemChips:
                Intent chips=new Intent(this,ChipsActivity.class);

                textView.setText("You chose Chips");
                getSupportActionBar().setTitle("Chips");
                startActivity(chips);
                return true;

            case R.id.menuItemPersonalPizza:
                Intent personal=new Intent(this,PersonalPizzaActivity.class);

                textView.setText("You chose Personal Pizza");
                getSupportActionBar().setTitle("Personal Pizza");
                startActivity(personal);
                return true;


        }



        return false;

    }

}