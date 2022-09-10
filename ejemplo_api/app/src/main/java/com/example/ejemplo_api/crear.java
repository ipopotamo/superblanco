package com.example.ejemplo_api;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class crear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear);

        EditText email       = (EditText) findViewById(R.id.Email);
        EditText contraseña  = (EditText) findViewById(R.id.Pasword);
        EditText dia         = (EditText) findViewById(R.id.dia);
        EditText hora        = (EditText) findViewById(R.id.hora);
        Button   boton       = (Button) findViewById(R.id.boton);






    }
}