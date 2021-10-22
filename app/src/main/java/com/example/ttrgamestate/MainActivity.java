package com.example.ttrgamestate;
//main view implemented by Ian Thompson, Bruce Baird, Trent Matsushima, and Jennifer Brana
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = (EditText) findViewById(R.id.test);
        TTRHumanPlayer view = (TTRHumanPlayer) findViewById(R.id.tacos);
        Button runTest = (Button) findViewById(R.id.runTest);
        TTRLocalGame local = new TTRLocalGame(view);
        local.ViewOnClick(text);
        runTest.setOnClickListener(local);


        TTRGameState gs= new TTRGameState(4);
        TTRGameState gameState = new TTRGameState(4);

        String test = gameState.toString();
        System.out.println(test);
    }
}