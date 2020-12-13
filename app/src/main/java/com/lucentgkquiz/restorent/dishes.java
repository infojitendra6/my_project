package com.lucentgkquiz.restorent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.lucentgkquiz.restorent.categories.dishe;

public class dishes extends AppCompatActivity {
    CardView cardView1, cardView2, cardView3;
    Integer total;
    String[] english = {"Chole Bhature", "Rogan Josh", "Stuffed Bati", "Sichuan Pork", " Dumplings", "Chow Mein", "Chicken", "Falafel", "Shakshuka", " dosa", " Sambar", "Sevai lunch", " Lasagna", "Ribollita", "Polenta", "Ossobuco", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings"};
    String[] hindi = {"छोले भटूरे", "रोगन जोश", "भरवां बाटी", "सिचुआन पोर्क", " पकौड़ा", "चाऊ मीन", "मुर्गी", "फलाफिल", "शकशुका", " डोसा", " सांभर", "सेवई लंच", " लज़ान्या", "रिवोल्ट", "खिचड़ी", "पकौड़ा", "पकौड़ा", " पकौड़ा", " पकौड़ा", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings", " Dumplings"};

    int images []={R.drawable.north1,  R.drawable.north2, R.drawable.north3, R.drawable.chiniese1, R.drawable.chiniese2, R.drawable.chiniese3,  R.drawable.mediter1,  R.drawable.mediter2,  R.drawable.mediter3,  R.drawable.south1,  R.drawable.mediter1,  R.drawable.soth3,  R.drawable.italian1,  R.drawable.mediter1,  R.drawable.chiniese2,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1,  R.drawable.mediter1};
    String[] priceh = {"कीमत: 200", "कीमत: 100", "कीमत: 300", "कीमत: 400", "कीमत: 200", "कीमत: 300", "कीमत: 100", "कीमत: 300", "कीमत: 500", "कीमत: 400", "कीमत: 200", "कीमत: 100", "कीमत: 500", "कीमत: 500", "कीमत: 800", "कीमत: 100", "कीमत: 100", "कीमत: 600", "कीमत: 800", "कीमत: 200", "कीमत: 100", "कीमत: 400", "कीमत: 500", "कीमत: 200", "कीमत: 500"};
    String[] price1 = {"Price: 200", "Price: 100", "Price: 300", "Price: 400", "Price: 200", "Price: 300", "Price: 100", "Price: 300", "Price: 500", "Price: 400", "Price: 200", "Price: 100", "Price: 500", "Price: 500", "Price: 800", "Price: 100", "Price: 100", "Price: 600", "Price: 800", "Price: 200", "Price: 100", "Price: 400", "Price: 500", "Price: 200", "Price: 500"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dishes);
        Toolbar toolbar = findViewById(R.id.set_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("RESTAURANT");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        cardView1=(CardView)findViewById(R.id.card1);
        cardView2=(CardView)findViewById(R.id.card2);
        cardView3=(CardView)findViewById(R.id.card3);
       final int d=dishe;

        ImageView imageView=(ImageView)findViewById(R.id.image);
        TextView name = (TextView) findViewById(R.id.name);
        TextView price = (TextView) findViewById(R.id.price);
        ImageView imageView2=(ImageView)findViewById(R.id.image2);
        TextView name2 = (TextView) findViewById(R.id.name2);
        TextView price2 = (TextView) findViewById(R.id.price2);
        ImageView imageView3=(ImageView)findViewById(R.id.image3);
        TextView name3 = (TextView) findViewById(R.id.name3);
        TextView price3 = (TextView) findViewById(R.id.price3);
        final SharedPreferences sharedPreferences = getSharedPreferences("restaurant", Context.MODE_PRIVATE);
        final Integer flag = sharedPreferences.getInt("lang", 1111);
      String last_order = sharedPreferences.getString("order", "छोले भटूरे");
         total = sharedPreferences.getInt("total", 0);

        if(flag==0)
        {

            imageView.setImageDrawable(getResources().getDrawable(images[0+d]));
            name.setText(hindi[0+d]);
            price.setText(priceh[0+d]);
            imageView2.setImageDrawable(getResources().getDrawable(images[1+d]));
            name2.setText(hindi[1+d]);
            price2.setText(priceh[1+d]);
            imageView3.setImageDrawable(getResources().getDrawable(images[2+d]));
            name3.setText(hindi[2+d]);
            price3.setText(priceh[2+d]);



        }
        else
        {

            imageView.setImageDrawable(getResources().getDrawable(images[0+d]));
            name.setText(english[0+d]);
            price.setText(price1[0+d]);
            imageView2.setImageDrawable(getResources().getDrawable(images[1+d]));
            name2.setText(english[1+d]);
            price2.setText(price1[1+d]);
            imageView3.setImageDrawable(getResources().getDrawable(images[2+d]));
            name3.setText(english[2+d]);
            price3.setText(price1[2+d]);


        }
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total++;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(flag==0)
                    editor.putString("order", hindi[0+d]);
                else
                    editor.putString("order", english[0+d]);
                editor.putInt("total", total);
                editor.commit();
                Intent intent = new Intent(dishes.this, cart.class);
                startActivity(intent);
                Toast.makeText(dishes.this, "Item Added to Cart ", Toast.LENGTH_SHORT).show();
            }
        });
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total++;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(flag==0)
                editor.putString("order", hindi[1+d]);
                else
                    editor.putString("order", english[1+d]);
                editor.putInt("total", total);
                editor.commit();
                Intent intent = new Intent(dishes.this, cart.class);
                startActivity(intent);
                Toast.makeText(dishes.this, "Item Added to Cart ", Toast.LENGTH_SHORT).show();
            }
        });
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total++;
                SharedPreferences.Editor editor = sharedPreferences.edit();
                if(flag==0)
                    editor.putString("order", hindi[2+d]);
                else
                    editor.putString("order", english[2+d]);
                editor.putInt("total", total);
                editor.commit();
                Intent intent = new Intent(dishes.this, cart.class);
                startActivity(intent);
                Toast.makeText(dishes.this, "Item Added to Cart ", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(dishes.this, "Language change Hindi to English ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(dishes.this, categories.class);
                startActivity(intent);
                finish();
            }
            else
            {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putInt("lang", 0);
                editor.commit();

                Toast.makeText(dishes.this, "Language change English to Hindi ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(dishes.this, categories.class);
                startActivity(intent);
                finish();
            }
        }
        else if (id == R.id.cart) {
            Intent intent = new Intent(dishes.this, cart.class);
            startActivity(intent);

        }


        if(item.getItemId() == android.R.id.home)
        {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}