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
    }
}
