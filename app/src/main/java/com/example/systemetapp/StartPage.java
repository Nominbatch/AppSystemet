package com.example.systemetapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPage extends AppCompatActivity {
//    private static boolean PROMPT=false;
    private Button buttonUnder20;
    private Button buttonOver20;
    public SharedPreferences preferences;
    public SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

//        SharedPreferences sharedPreferences= getSharedPreferences("Prompt", Context.MODE_PRIVATE);
        preferences= PreferenceManager.getDefaultSharedPreferences(this);


        buttonUnder20 = findViewById(R.id.buttonUnder20);
        buttonUnder20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.arla.dk/produkter/arla-kids/");
                Intent intent = new Intent( Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        buttonOver20=(Button)findViewById(R.id.buttonOver20);
        buttonOver20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            openNew_main();
            changePrompt();

//            PROMPT=true;
            }
        });
    }

    public void openNew_main(){
        Intent intent= new Intent(this,New_main.class);
        startActivity(intent);
    }
//    public static boolean getPrompt(){
//        return PROMPT;
//    }
    public void changePrompt(){
        editor=preferences.edit();
        editor.putBoolean("prompt",true);
        editor.apply();
    }

    @Override
    public void onBackPressed() {

    }
}
