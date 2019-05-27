package com.example.systemetapp;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {
//    boolean prompt= StartPage.getPrompt();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        SharedPreferences preferences= PreferenceManager.getDefaultSharedPreferences(this);
        boolean value= preferences.getBoolean("prompt",false);
        if(!value){
            autoRun();
        } else {
            autoRun2();
        }

    }



    private void autoRun(){
        Intent intent = new Intent(this,StartPage.class );
        startActivity(intent);
    }
    private void autoRun2(){
        Intent intent = new Intent(this,MainActivity.class );
        startActivity(intent);
    }


}
