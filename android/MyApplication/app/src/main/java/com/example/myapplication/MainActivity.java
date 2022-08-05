package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText paz;
    private EditText Ema;
    private Button  pipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Ema  = (EditText) findViewById(R.id.nombre);
        paz  = (EditText) findViewById(R.id.contra);
        pipo = (Button) findViewById(R.id.dolar);


    }

    public void jotaro(View v)
    {

        String lol1 = Ema.getText().toString();
        String lol2 = paz.getText().toString();


        if(lol1 == "pipo@gmail.com"){
            Intent popo = new Intent(this, MainActivity2.class);
            startActivity(popo);
        }
    }

}