package com.ultra.praktikum_ppb_agus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Greeting = (Button) findViewById(R.id.button1);
        Greeting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tekanbt1 = new Intent(getApplicationContext(),TombolModulSatu.class);
                startActivity(tekanbt1);
            }
        });

        Button Modul2 = (Button) findViewById(R.id.button2);
        Modul2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tekanbt2 = new Intent(getApplicationContext(),TampilModulDua.class);
                startActivity(tekanbt2);
            }
        });

        Button Modul3 = (Button) findViewById(R.id.button3);
        Modul3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tekanbt3 = new Intent(getApplicationContext(),TampilModulTiga.class);
                startActivity(tekanbt3);
            }
        });

        Button Modul4 = (Button) findViewById(R.id.button4);
        Modul4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tekanbt4 = new Intent(getApplicationContext(),TampilModulEmpat.class);
                startActivity(tekanbt4);
            }
        });
    }
}
