package com.example.studentsapp;

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
        configeraboutusbtn();
        configerlistwordsbtn();
    }

    private void configeraboutusbtn(){
        Button aboutusBtn = (Button) findViewById(R.id.aboutusbtn);
        aboutusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(MainActivity.this,aboutus.class));
            }
        });


    }

    private void configerlistwordsbtn(){
        final Button listBtn = (Button)findViewById(R.id.listBtn);
        listBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,listofwords.class));
            }
        });
    }
}
