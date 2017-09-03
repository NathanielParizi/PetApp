package com.jtanuki.go.petapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView sand;
    private ImageView godzilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sand = (ImageView) findViewById(R.id.sand);
        godzilla = (ImageView) findViewById(R.id.godzilla);

        sand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Sandshrew clicked", Toast.LENGTH_LONG).show();
                Intent sandIntent = new Intent(MainActivity.this, Main2Activity.class);
               sandIntent.putExtra("name","Sandy");
                startActivity(sandIntent);
            }
        });

        godzilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Godzilla clicked", Toast.LENGTH_LONG).show();

                Intent godzIntent = new Intent(MainActivity.this, Main3Activity.class);
                godzIntent.putExtra("name","Godzookie");
                startActivity(godzIntent);
            }
        });

    }
}
