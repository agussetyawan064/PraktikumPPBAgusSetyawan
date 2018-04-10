package com.ultra.praktikum_ppb_agus;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by LEON-PC on 03/04/2018.
 */

public class TampilModulDua extends AppCompatActivity {


    int ch = 1;
    float font = 30;
    int text = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_modul_dua);

        final TextView t = (TextView) findViewById(R.id.hello);
        Button b1 = (Button) findViewById(R.id.btnFontSize);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t.setTextSize(font);
                font = font + 5;
                if (font == 50)
                    font = 30;
            }
        });
        Button b2 = (Button) findViewById(R.id.btnColor);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (ch) {
                    case 1:
                        t.setTextColor(Color.RED);
                        break;
                    case 2:
                        t.setTextColor(Color.GREEN);
                        break;
                    case 3:
                        t.setTextColor(Color.BLUE);
                        break;
                    case 4:
                        t.setTextColor(Color.CYAN);
                        break;
                    case 5:
                        t.setTextColor(Color.YELLOW);
                        break;
                    case 6:
                        t.setTextColor(Color.MAGENTA);
                        break;
                }
                ch++;
                if (ch == 7)
                    ch = 1;
            }
        });
        Button b3 = (Button) findViewById(R.id.btnChangeText);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (text) {
                    case 1:
                        t.setText("Satu");
                        break;
                    case 2:
                        t.setText("Dua");
                        break;
                    case 3:
                        t.setText("Tiga");
                        break;
                    case 4:
                        t.setText("Empat");
                        break;
                    default:
                        t.setText("Hello World");
                        text = 0;
                }
                text++;
            }
        });

    }
}

