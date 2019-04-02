package com.example.studentsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class listofwords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofwords);
        configerbackBtn();
    }

    private void configerbackBtn(){
        Button bkButton = (Button) findViewById(R.id.bkBtn);
        bkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(listofwords.this,MainActivity.class));
            }
        });
    }
}
