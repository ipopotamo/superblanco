package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Script;
import android.security.identity.AccessControlProfileId;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button   pipo = (Button)   findViewById(R.id.button);
        TextView juan = (TextView) findViewById(R.id.textView);
        TextView paz  = (TextView) findViewById(R.id.editTextTextPassword);
        TextView Ema  = (TextView) findViewById(R.id.editTextTextEmailAddress);
        TextView bla  = (TextView) findViewById(R.id.textView2);


        String pas = "PoroElegante";
        String Em  = "PoroElegante@gmail.com";

        String paz2 = (paz.getText().toString());
        String ema2 = (Ema.getText().toString());


        pipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (pas == paz2 && ema2 == Em) {

                    Intent popo = new Intent(this,Activity2);
                    startActivity(popo);

                }




            }
        });




    }
}