package com.example.convertcurrencylabweek3;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText txtDollarField = (EditText) findViewById(R.id.txtDollarField);
        Double RinggitAmount = Double.parseDouble(txtDollarField.getText().toString());
        Double CroatianKunaAmount = RinggitAmount * 1.52;
        Toast.makeText(getApplicationContext(),   CroatianKunaAmount.toString() + "kn ", Toast.LENGTH_LONG).show();
    }
}