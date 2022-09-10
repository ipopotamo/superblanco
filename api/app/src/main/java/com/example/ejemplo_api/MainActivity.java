package com.example.ejemplo_api;

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

        Intent popo  = new Intent(this, crear.class);
        Intent juan  = new Intent(this, buscar.class);

        Button pipo = (Button) findViewById(R.id.crear);
        Button SH   = (Button) findViewById(R.id.buscar);

        pipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                startActivity(popo);

            }
        });
        SH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(juan);
            }


        });

    }
}