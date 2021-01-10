package com.example.ezyfood;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static int orderList[] = {0,0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayDrinks(View view){
        Intent intent = new Intent(this, DrinksActivity.class);
        startActivity(intent);
    }

    public void myOrder(View view){
        Intent intent = new Intent(this,myOrderActivity.class);
        startActivity(intent);
    }


    public void viewHistory(View view) {
        Intent intent = new Intent(this, HistoryActivity.class);
    }
}