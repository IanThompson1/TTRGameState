package com.example.ttrgamestate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TTRGameState gs= new TTRGameState(2);

        TTRGameState gameState = new TTRGameState(2);

        //MultilineText text = new MultilineText
        String test = gameState.toString();
        System.out.println(test);

        //TTRGameState. p = TTRGameState.;
    }
}