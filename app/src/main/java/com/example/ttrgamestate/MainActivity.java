package com.example.ttrgamestate;
//main view implemented by Ian Thompson, Bruce Baird, Trent Matsushima, and Jennifer Brana
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TTRHumanPlayer view = (TTRHumanPlayer) findViewById(R.id.tacos);
        Button runTest = (Button) findViewById(R.id.runTest);
        TTRLocalGame local = new TTRLocalGame(view);
        runTest.setOnClickListener(local);



        TTRGameState gs= new TTRGameState(4);

        TTRGameState gameState = new TTRGameState(4);

        EditText text = (EditText) findViewById(R.id.text);


        String test = gameState.toString();
        System.out.println(test);

        //TTRGameState. p = TTRGameState.;
    }
}