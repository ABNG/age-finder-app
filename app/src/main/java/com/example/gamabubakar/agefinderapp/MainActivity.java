package com.example.gamabubakar.agefinderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.button);
        et=findViewById(R.id.editText);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(et.getText().length()>0) {
            int age = Integer.parseInt(et.getText().toString());
            Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int total = year - age;
            Intent intent = new Intent(MainActivity.this, Welcom.class);
            intent.putExtra("age", total);
            startActivity(intent);
        }
        else{
            Toast.makeText(getApplicationContext(),"Enter Your Age",Toast.LENGTH_LONG).show();
        }
    }
}
