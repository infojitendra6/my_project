package com.lucentgkquiz.restorent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button hindi, english;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final SharedPreferences sharedPreferences = getSharedPreferences("restaurant", Context.MODE_PRIVATE);
        Integer flag = sharedPreferences.getInt("lang", 1111);

        hindi=findViewById(R.id.hindi);
        english=findViewById(R.id.english);
   if(flag==0||flag==1)
{

    Intent intent = new Intent(MainActivity.this, categories.class);
    startActivity(intent);
    finish();

}
   else
   {
       hindi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               SharedPreferences.Editor editor = sharedPreferences.edit();
               editor.putInt("lang", 0);
               editor.commit();

               Intent intent = new Intent(MainActivity.this, categories.class);
               startActivity(intent);
               finish();

           }
       });
       english.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               SharedPreferences.Editor editor = sharedPreferences.edit();
               editor.putInt("lang", 1);
               editor.commit();

               Intent intent = new Intent(MainActivity.this, categories.class);
               startActivity(intent);
               finish();

           }
       });


   }

    }
}