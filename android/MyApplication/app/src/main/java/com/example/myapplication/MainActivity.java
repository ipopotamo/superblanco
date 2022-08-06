package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private String contraseña2 = "perry";
    private String email2      = "pipo@gmail.com";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent popo = new Intent(this, MainActivity2.class);

        EditText email       = (EditText) findViewById(R.id.nombre);
        EditText contraseña  = (EditText) findViewById(R.id.contra);
        Button pipo = (Button) findViewById(R.id.dolar);

        pipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((email.getText().toString()).equals(email2) && (contraseña.getText().toString()).equals(contraseña2)){

                    Log.d("TUSUPERVIEJA","juan");
                    startActivity(popo);
                }
            }
        });




    }

}