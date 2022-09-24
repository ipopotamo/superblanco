package com.example.ejemplo_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    private  RequestQueue mRequestQueue;
    private  StringRequest mStringRequest;

    private EditText edad;

    private String url = "http:/192.168.137.1/androidusers/buscar.php";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent popo = new Intent(this, crear.class);
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
                    sendAndRequestResponse();
                    startActivity(juan);
                }


    });

    }
    private void sendAndRequestResponse() {
        mRequestQueue= Volley.newRequestQueue(this);
        mStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("HttpClient","success! response: "+response.toString());
                Toast.makeText(getApplicationContext(),"Response: "+ response.toString());

            }
        });

    }
    private void onErrorResponse(volleyError error){
        Log.e(TAG,"error: " +error.toString);
    }
}