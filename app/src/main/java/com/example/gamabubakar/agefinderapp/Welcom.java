package com.example.gamabubakar.agefinderapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Welcom extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcom);
        Toast.makeText(Welcom.this,"WELCOME TO SECOND ACTIVITY",Toast.LENGTH_LONG).show();
        Bundle b= getIntent().getExtras();
        int age=b.getInt("age");
        tv=findViewById(R.id.textView);
        tv.setText("You are "+age+" years old");
    }

    public void finish(View view) {
        finish();
    }
}
