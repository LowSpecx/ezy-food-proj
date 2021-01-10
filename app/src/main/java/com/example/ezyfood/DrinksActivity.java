package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


public class DrinksActivity extends AppCompatActivity {

    ImageButton aquaButton,cokeButton,appleJuiceButton,avocadoJuiceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        cokeButton = (ImageButton) findViewById(R.id.coca_cola);
        aquaButton = (ImageButton) findViewById(R.id.aqua);
        appleJuiceButton = (ImageButton) findViewById(R.id.apple_juice);
        avocadoJuiceButton = (ImageButton) findViewById(R.id.avocado_juice);

        cokeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                MainActivity.orderList[0] += 1;
                addToCart(v);
            }
        });

        aquaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                MainActivity.orderList[1] += 1;
                addToCart(v);
            }
        });

        appleJuiceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                MainActivity.orderList[2] += 1;
                addToCart(v);
            }
        });

        avocadoJuiceButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                MainActivity.orderList[3] += 1;
                addToCart(v);
            }
        });

    }

    public void addToCart(View view){
        Intent intent = new Intent(this, orderActivity.class);
        startActivity(intent);
    }

    public void myOrder(View view){
        Intent i = new Intent(this,myOrderActivity.class);
        startActivity(i);
    }


}