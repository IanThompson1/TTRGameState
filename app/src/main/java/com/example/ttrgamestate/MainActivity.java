package com.example.ttrgamestate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TTRGameState gs= new TTRGameState(4);

        TTRGameState gameState = new TTRGameState(4);

        EditText text = (EditText) findViewById(R.id.text);
        String test = gameState.toString();
        System.out.println(test);

        //TTRGameState. p = TTRGameState.;
    }
}