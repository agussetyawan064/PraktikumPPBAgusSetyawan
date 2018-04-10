package com.ultra.praktikum_ppb_agus;

/**
 * Created by LEON-PC on 10/04/2018.
 */

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.Locale;

import static android.icu.util.Calendar.getInstance;

public class TampilModulTiga extends AppCompatActivity {

    EditText e1,e2,e4,e5, tanggal;
    Button bt, tgl;
    Spinner s;
    SimpleDateFormat dateFormatter;

    String[]dept_array={"CSE","ECE","IT","Mech","Civil"};
    String name, reg, dept, kota, hobi, tglLahir;

    public void showDateDialog(){
        Calendar newCalender = getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog ( this, new DatePickerDialog.OnDateSetListener () {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance ();
                newDate.set ( year, month, dayOfMonth );

                tanggal.setText ( dateFormatter.format ( newDate.getTime () ) );
            }
        }, newCalender.get ( Calendar.YEAR ), newCalender.get ( Calendar.MONTH ), newCalender.get ( Calendar.DAY_OF_MONTH ));
        datePickerDialog.show ();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampil_modul_tiga);

        e1=(EditText)findViewById ( R.id.edt1 );
        e2=(EditText)findViewById ( R.id.edt2 );
        e4=(EditText ) findViewById ( R.id.edt4 );
        e5=(EditText ) findViewById ( R.id.edt5 );
        tanggal=(EditText ) findViewById ( R.id.txttgl );
        bt=(Button)findViewById ( R.id.tombl );
        s=(Spinner)findViewById ( R.id.spinner );

        dateFormatter = new SimpleDateFormat ( "dd-MM-yyyy", Locale.US );
        tanggal = (EditText ) findViewById ( R.id.txttgl );
        tgl=(Button ) findViewById ( R.id.tmblTanggal );

        ArrayAdapter adapter=new ArrayAdapter ( TampilModulTiga.this, android.R.layout.simple_spinner_item,dept_array );
        s.setAdapter ( adapter );

        bt.setOnClickListener ( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=e1.getText ().toString ();
                reg=e2.getText ().toString ();
                tglLahir=tanggal.getText ().toString ();
                kota=e4.getText ().toString ();
                hobi=e5.getText ().toString ();
                dept=s.getSelectedItem ().toString ();

                Intent i=new Intent ( TampilModulTiga.this, TampilModulTigaData.class );

                i.putExtra ( "name_key", name );
                i.putExtra ( "reg_key", reg );
                i.putExtra ( "dept_key", dept );
                i.putExtra ( "tglLahir_key", tglLahir );
                i.putExtra ( "kota_key", kota );
                i.putExtra ( "hobi_key",hobi );

                startActivity ( i );
            }
        } );

        dateFormatter = new SimpleDateFormat ( "dd-MM-yyyy", Locale.US );
        tanggal =(EditText) findViewById ( R.id.txttgl );
        tgl = (Button) findViewById ( R.id.tmblTanggal );
        tgl.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                showDateDialog ();
            }
        } );
    }


}
