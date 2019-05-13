package com.example.systemetapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {

    private Button buttonUnder20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);
        buttonUnder20 = findViewById(R.id.buttonUnder20);
        buttonUnder20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.arla.dk/produkter/arla-kids/");
                Intent intent = new Intent( Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }




}
