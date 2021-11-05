package com.example.lezione1_userform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;

public class ResultActivity extends AppCompatActivity {

    Button indietro;

    TextView nomeResult, cognomeResult, dataResult, indirizzoResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        indietro=findViewById(R.id.indietro);   //Button 'indietro'
        //le variabili accolgono i dati passati nel form
        nomeResult=findViewById(R.id.nomeConferma);
        cognomeResult=findViewById(R.id.cognomeConferma);
        dataResult=findViewById(R.id.dataConferma);
        indirizzoResult=findViewById(R.id.indirizzoConferma);

        Persona getPersona = new Persona();

        Intent intent = getIntent();    //riceviamo i dati dal form activity
        Serializable serializable = intent.getSerializableExtra(FormActivity.PERSONA_PATH);
        getPersona = (Persona)serializable;

        nomeResult.setText(getPersona.getNome());
        cognomeResult.setText(getPersona.getCognome());
        dataResult.setText(getPersona.getDataDiNascita());
        indirizzoResult.setText(getPersona.getIndirizzo());

        indietro.setOnClickListener(new View.OnClickListener() {    //passaggio da un'activity all'altra
            @Override
            public void onClick(View v) {
                Intent backButton = new Intent(ResultActivity.this, FormActivity.class);
                startActivity(backButton);

            }
        });
    }
}