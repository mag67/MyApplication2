package com.example.myapplication;

import java.io.*;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent=getIntent();
        String message=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView textView=findViewById(R.id.textView);
        textView.setText(Omikuji(message));

    }

    public String Omikuji(String msg){

        int unseiNum=(int)(Math.random()*10);
        Log.d("Omikuji","unseiNum:"+unseiNum);

        String unsei="";
        switch(unseiNum){
            case 0:
                unsei="大凶";
                break;
            case 1:
            case 2:
                unsei="凶";
                break;
            case 3:
            case 4:
                unsei="末吉";
                break;
            case 5:
            case 6:
                unsei="小吉";
                break;
            case 7:
            case 8:
                unsei="中吉";
                break;
            case 9:
                unsei="大吉";
                break;
        };


        return msg+"の今日の運勢は"+unsei+"です。";

    }
}
