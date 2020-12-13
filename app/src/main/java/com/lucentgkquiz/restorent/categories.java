package com.lucentgkquiz.restorent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class categories extends AppCompatActivity {
    String last_order;
    String[] foodE = {"Chole Bhature", "Rogan Josh", "Stuffed Bati", "Sichuan Pork", " Dumplings", "Chow Mein", "Chicken", "Falafel", "Shakshuka", " dosa", " Sambar", "Sevai lunch", " Lasagna", "Ribollita", "Polenta", "Ossobuco", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings"};
    String[] foodh = {"छोले भटूरे", "रोगन जोश", "भरवां बाटी", "सिचुआन पोर्क", " पकौड़ा", "चाऊ मीन", "मुर्गी", "फलाफिल", "शकशुका", " डोसा", " सांभर", "सेवई लंच", " लज़ान्या", "रिवोल्ट", "खिचड़ी", "पकौड़ा", "पकौड़ा", " पकौड़ा", " पकौड़ा", "पकौड़ा", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings"};


    public static int dishe=0;
    int images []={10,  5, R.drawable.north3};
    CardView cardView1, cardView2, cardView3, cardView4, cardView5, cardView6;
    String[] english = {"North Indian", "Chinese", "Mediterranean", "South Indian", "Italian"};
    String[] hindi = {"उत्तर भारतीय खाना", "चीनी खाना", "आभ्यंतरिक खाना", "दक्षिण भारतीय खाना", "इतालवी खाना"};
    String[] disNoh ={"संख्या:-5", "संख्या:-9", "संख्या:-8", "संख्या:-4", "संख्या:-10"};
    String[] disNoE = {"No. of dishes:5", "No. of dishes:9", "No. of dishes:8", "No. of dishes:9", "No. of dishes:10"};
    String[] priceh = {"मूल्य:- 50-500", "मूल्य:- 500-900", "मूल्य:- 50-100", "मूल्य:- 100-500", "मूल्य:- 200-500"};
    String[] priceE = {"Range:- 50-500", "Range:- 500-900", "Range:- 50-100", "Range:- 100-500", "Range:- 200-500"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Toolbar toolbar = findViewById(R.id.set_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("RESTAURANT");


        TextView serial1 = (TextView) findViewById(R.id.serial1);
        TextView serial2 = (TextView) findViewById(R.id.serial2);
        TextView serial3 = (TextView) findViewById(R.id.serial3);
        TextView serial4 = (TextView) findViewById(R.id.serial4);
        TextView serial5 = (TextView) findViewById(R.id.serial5);

        TextView yourOrder = (TextView) findViewById(R.id.yourQrder);

        cardView1=(CardView)findViewById(R.id.card1);
        cardView2=(CardView)findViewById(R.id.card2);
        cardView3=(CardView)findViewById(R.id.card3);
        cardView4=(CardView)findViewById(R.id.card4);
        cardView5=(CardView)findViewById(R.id.card5);

        TextView name = (TextView) findViewById(R.id.name);
        TextView price = (TextView) findViewById(R.id.price);
        TextView food = (TextView) findViewById(R.id.food);
        TextView name2 = (TextView) findViewById(R.id.name2);
        TextView price2 = (TextView) findViewById(R.id.price2);
        TextView food2 = (TextView) findViewById(R.id.food2);
        TextView name3 = (TextView) findViewById(R.id.name3);
        TextView price3 = (TextView) findViewById(R.id.price3);
        TextView food3 = (TextView) findViewById(R.id.food3);
        TextView name4 = (TextView) findViewById(R.id.name4);
        TextView price4 = (TextView) findViewById(R.id.price4);
        TextView food4 = (TextView) findViewById(R.id.food4);
        TextView name5 = (TextView) findViewById(R.id.name5);
        TextView price5 = (TextView) findViewById(R.id.price5);
        TextView food5 = (TextView) findViewById(R.id.food5);

        final SharedPreferences sharedPreferences = getSharedPreferences("restaurant", Context.MODE_PRIVATE);
       final Integer flag = sharedPreferences.getInt("lang", 1111);
        if(flag==0)
        {
            last_order = sharedPreferences.getString("order", "छोले भटूरे");
            int i = (int)(Math.random() *14);
            serial1.setText("प्रथम उच्चतम आदेश:-"+foodh[1+i]);
            serial2.setText("दूसरा उच्चतम आदेश:-"+foodh[2+i]);
            serial3.setText("तीसरा उच्चतम आदेश :-"+foodh[3+i]);
            serial4.setText("4 वां  उच्चतम आदेश:-"+foodh[4+i]);
            serial5.setText("5 वां उच्चतम आदेश :-"+foodh[5+i]);
            yourOrder.setText("आपका अंतिम आदेश:-"+last_order);

            food.setText(hindi[0]);
            name.setText(disNoh[0]);
            price.setText(priceh[0]);
            food2.setText(hindi[1]);
            name2.setText(disNoh[1]);
            price2.setText(priceh[1]);
            food3.setText(hindi[2]);
            name3.setText(disNoh[2]);
            price3.setText(priceh[2]);
            food4.setText(hindi[3]);
            name4.setText(disNoh[3]);
            price4.setText(priceh[3]);
            food5.setText(hindi[4]);
            name5.setText(disNoh[4]);
            price5.setText(priceh[4]);

        }
        else
        {
             last_order = sharedPreferences.getString("order", "Chole Bhature");
            food.setText(english[0]);
            name.setText(disNoE[0]);
            price.setText(priceE[0]);
            food2.setText(english[1]);
            name2.setText(disNoE[1]);
            price2.setText(priceE[1]);
            food3.setText(english[2]);
            name3.setText(disNoE[2]);
            price3.setText(priceE[2]);
            food4.setText(english[3]);
            name4.setText(disNoE[3]);
            price4.setText(priceE[3]);
            food5.setText(english[4]);
            name5.setText(disNoE[4]);
            price5.setText(priceE[4]);

            int i = (int)(Math.random() *14);
            serial1.setText("1st highest Order dishe:-"+foodE[1+i]);
            serial2.setText("2nd highest Order dishe:-"+foodE[2+i]);
            serial3.setText("3rd highest Order dishe:-"+foodE[3+i]);
            serial4.setText("4th highest Order dishe:-"+foodE[4+i]);
            serial5.setText("5th highest Order dishe:-"+foodE[5+i]);
            yourOrder.setText("Your Last Order:-"+last_order);
        }

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishe=0;
                Intent intent = new Intent(categories.this, dishes.class);
                startActivity(intent);

            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishe=3;
                Intent intent = new Intent(categories.this, dishes.class);
                startActivity(intent);

            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishe=6;
                Intent intent = new Intent(categories.this, dishes.class);
                startActivity(intent);

            }
        });
        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishe=9;
                Intent intent = new Intent(categories.this, dishes.class);
                startActivity(intent);

            }
        });
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dishe=12;
                Intent intent = new Intent(categories.this, dishes.class);
                startActivity(intent);

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.change) {
            final SharedPreferences sharedPreferences = getSharedPreferences("restaurant", Context.MODE_PRIVATE);
            Integer flag = sharedPreferences.getInt("lang", 1111);

            if(flag==0)
            {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("lang", 1);
                editor.commit();
                Toast.makeText(categories.this, "Language change Hindi to English ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(categories.this, categories.class);
                startActivity(intent);
                finish();
            }
            else
            {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("lang", 0);
                editor.commit();
                Toast.makeText(categories.this, "Language change English to Hindi ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(categories.this, categories.class);
                startActivity(intent);
                finish();
            }
        }
        else if (id == R.id.cart) {
            Intent intent = new Intent(categories.this, cart.class);
            startActivity(intent);
        }



        return super.onOptionsItemSelected(item);
    }
}