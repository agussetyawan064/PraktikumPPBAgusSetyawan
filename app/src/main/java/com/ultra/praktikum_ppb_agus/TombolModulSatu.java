package com.ultra.praktikum_ppb_agus;

/**
 * Created by LEON-PC on 27/03/2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TombolModulSatu extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_tombol_modul_satu);

        Button gr = (Button) findViewById(R.id.greeting);
        gr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btgr = new Intent(getApplicationContext(),TampilModulSatu.class);
                Toast.makeText(TombolModulSatu.this, "Hallo Agus Setyawan Nim 140411100064", Toast.LENGTH_SHORT).show();
                startActivity(btgr);
            }
        });
    }
}
