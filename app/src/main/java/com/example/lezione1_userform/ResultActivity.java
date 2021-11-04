package com.example.lezione1_userform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultActivity extends AppCompatActivity {

    Button indietro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        indietro=findViewById(R.id.indietro);

        indietro.setOnClickListener(new View.OnClickListener() {    //passaggio da un'activity all'altra
            @Override
            public void onClick(View v) {
                Intent backButton = new Intent(ResultActivity.this, FormActivity.class);
                startActivity(backButton);
            }
        });
    }
}