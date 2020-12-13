package com.lucentgkquiz.restorent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        Toolbar toolbar = findViewById(R.id.set_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Your Cart");


        final SharedPreferences sharedPreferences = getSharedPreferences("restaurant", Context.MODE_PRIVATE);
         Integer total = sharedPreferences.getInt("total", 1);
        final Integer flag = sharedPreferences.getInt("lang", 1111);
        String last_order = sharedPreferences.getString("order", "Chole Bhature");
        TextView totalNO = (TextView) findViewById(R.id.serial1);
        TextView last = (TextView) findViewById(R.id.yourQrder);
        if(flag==0)
        {
            totalNO.setText("कुल आदेश:-"+total);
            last.setText("आपका अंतिम आदेश:-"+last_order);
        }
        else
        {
            totalNO.setText("Total Order:-"+total);
            last.setText("Your Last Order :-"+last_order);
        }

    }
}