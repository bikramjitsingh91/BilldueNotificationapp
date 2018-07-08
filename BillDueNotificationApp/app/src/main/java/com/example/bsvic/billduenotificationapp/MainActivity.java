package com.example.bsvic.billduenotificationapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button find = (Button) findViewById(R.id.button_id);
        find.setOnClickListener((v)-> {
            EditText postalCode = findViewById(R.id.postal_code);
            String postalCodeText = postalCode.getText().toString();

            //Getting the Google map
            String address = "geo:0,0?q=" + postalCodeText;
            Uri gmmIntentUri = Uri.parse(address);
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });

        //Button scanner = (Button) findViewById(R.id);
    }
}
