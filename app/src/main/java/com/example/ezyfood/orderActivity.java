package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class orderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        //TextView cokeTextView = findViewById(R.id.coke_qty);

        //String text = "";
        //cokeTextView.setText(text+MainActivity.orderList[0]);
        showTable();
    }

    public void showTable(){

        ArrayList<TableRow> myOrders = new ArrayList<TableRow>();
        myOrders.add((TableRow)findViewById(R.id.tableRow_coke));
        myOrders.add((TableRow)findViewById(R.id.tableRow_aqua));
        myOrders.add((TableRow)findViewById(R.id.tableRow_apple));
        myOrders.add((TableRow)findViewById(R.id.tableRow_avocado));

        ArrayList<TextView> qtyTextView = new ArrayList<TextView>();
        qtyTextView.add((TextView)findViewById(R.id.qty_coke));
        qtyTextView.add((TextView)findViewById(R.id.qty_aqua));
        qtyTextView.add((TextView)findViewById(R.id.qty_apel));
        qtyTextView.add((TextView)findViewById(R.id.qty_alpukat));

        int quantityIndex = 0;


        for(TableRow myorder : myOrders){
            if(MainActivity.orderList[quantityIndex] == 0){
                myorder.setVisibility(View.INVISIBLE);
            }else{
                qtyTextView.get(quantityIndex).setText("Quantity: " + MainActivity.orderList[quantityIndex]);
            }
            quantityIndex++;
        }

    }

    public void orderMore(View view){
        Intent intent = new Intent(this,DrinksActivity.class);
        startActivity(intent);
    }

    public void myOrder(View view){
        Intent intent = new Intent(this,myOrderActivity.class);
        startActivity(intent);
    }
}