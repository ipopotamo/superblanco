package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button pipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        pipo = (Button) findViewById(R.id.button3);

    }

    public void tumamaa(View view)
    {
        Intent popo = new Intent(this, MainActivity.class);
        startActivity(popo);
    }
}