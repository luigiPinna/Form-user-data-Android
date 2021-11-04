package com.example.lezione1_userform;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nome, cognome, dataDiNascita;

    public Persona(String nome, String cognome, String dataDiNascita) { //costruttore con tutti i dati
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public Persona() {      //costruttore vuoto
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
