package com.example.ezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class orderCompleteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_complete);

        calculateTotal();
        showItems();

        for(int i=0 ; i<=3 ; i++){
            MainActivity.orderList[i] = 0;
        }
    }

    public void calculateTotal(){
        int total=0;

        total += (MainActivity.orderList[0] * 10000);
        total += (MainActivity.orderList[1] * 6000);
        total += (MainActivity.orderList[2] * 12000);
        total += (MainActivity.orderList[3] * 14000);

        TextView textTotalPrice = (TextView)findViewById(R.id.finalTotal);
        textTotalPrice.setText("Total Rp." + total);
    }

    public void showItems(){
        ArrayList<TextView> itemList = new ArrayList<TextView>();
        itemList.add((TextView)findViewById(R.id.textView18));
        itemList.add((TextView)findViewById(R.id.textView19));
        itemList.add((TextView)findViewById(R.id.textView20));
        itemList.add((TextView)findViewById(R.id.textView21));

        String itemName[] = {"Coca Cola","Aqua","Jus Apel","Jus Alpukat"};
        int prices[] = {10000,6000,12000,14000};

        int itemListIndex=0;
        int index;
        for(index=0 ; index<=3 ; index++){
            if(MainActivity.orderList[index] != 0){
                itemList.get(itemListIndex).setText(itemName[index] + "\n" +
                        MainActivity.orderList[index]+" x Rp."+prices[index]);
                itemListIndex++;
            }
        }
    }

    public void menuUtama(View view){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }


}