package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class myOrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);
        calculatePrice();
        showTable();

        Button deleteCoke = (Button)findViewById(R.id.delete_coke);
        deleteCoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.orderList[0] = 0;
                calculatePrice();
                showTable();
            }
        });

        Button deleteAqua = (Button)findViewById(R.id.delete_aqua);
        deleteAqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.orderList[1] = 0;
                calculatePrice();
                showTable();
            }
        });

        Button deleteApple = (Button)findViewById(R.id.delete_apple);
        deleteApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.orderList[2] = 0;
                calculatePrice();
                showTable();
            }
        });

        Button deleteAvocado = (Button)findViewById(R.id.delete_avocado);
        deleteAvocado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.orderList[3] = 0;
                calculatePrice();
                showTable();
            }
        });
    }

    public void payNow(View v){
        Intent i = new Intent(this,orderCompleteActivity.class);
        startActivity(i);
    }

    public void calculatePrice(){
        int total = 0;
        total += (MainActivity.orderList[0] * 10000);
        total += (MainActivity.orderList[1] * 6000);
        total += (MainActivity.orderList[2] * 12000);
        total += (MainActivity.orderList[3] * 14000);

        TextView textTotalPrice = (TextView)findViewById(R.id.totalPrice);
        textTotalPrice.setText("Total Rp." + total);
    }

    public void showTable(){

        ArrayList<TableRow> myOrders = new ArrayList<TableRow>();
        myOrders.add((TableRow)findViewById(R.id.my_order1));
        myOrders.add((TableRow)findViewById(R.id.my_order2));
        myOrders.add((TableRow)findViewById(R.id.my_order3));
        myOrders.add((TableRow)findViewById(R.id.my_order4));

        ArrayList<TextView> qtyTextView = new ArrayList<TextView>();
        qtyTextView.add((TextView)findViewById(R.id.my_order_qty_coke));
        qtyTextView.add((TextView)findViewById(R.id.my_order_qty_aqua));
        qtyTextView.add((TextView)findViewById(R.id.myOrder_qty_apple));
        qtyTextView.add((TextView)findViewById(R.id.myOrder_qty_avocado));

        int prices[] = {10000,6000,12000,14000};

        int quantityIndex = 0;


        for(TableRow myorder : myOrders){
            if(MainActivity.orderList[quantityIndex] == 0){
                myorder.setVisibility(View.INVISIBLE);
            }else{
                qtyTextView.get(quantityIndex).setText(""+MainActivity.orderList[quantityIndex]+" x"
                                +" Rp."+prices[quantityIndex]);
            }
            quantityIndex++;
        }

    }


}