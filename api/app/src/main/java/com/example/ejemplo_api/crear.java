package com.example.ejemplo_api;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        //Request


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {


                String  Email ;
                String  Contra;
                String  Dia;
                String  Hora;

                Email  = String.valueOf(email.getText());
                Contra = String.valueOf(contraseña.getText());
                Dia = String.valueOf(dia.getText());
                Hora = String.valueOf(hora.getText());



            }
        });




    }
}