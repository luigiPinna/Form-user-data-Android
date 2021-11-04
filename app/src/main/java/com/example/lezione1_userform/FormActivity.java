package com.example.lezione1_userform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FormActivity extends AppCompatActivity {

    EditText nome, cognome, data;

    Persona persona;
    public static final String PERSONA_PATH="com.example.lezione1_userform.Persona";

    Button inserisci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        //campi inseriti dall'utente nel form
        nome= findViewById(R.id.attrNome);
        cognome= findViewById(R.id.attrCognome);
        data= findViewById(R.id.attrData);

        persona= new Persona();
        inserisci = findViewById(R.id.inserisci);


        //Passaggio da un'activity all'altra al click
        inserisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent showResult = new Intent(FormActivity.this, ResultActivity.class);

                showResult.putExtra(PERSONA_PATH, persona); //deve essere serializable

                startActivity(showResult);
            }
        });

    }

    private void aggiornaPersona(){
        this.persona.setNome(nome.getText().toString());
    }
}