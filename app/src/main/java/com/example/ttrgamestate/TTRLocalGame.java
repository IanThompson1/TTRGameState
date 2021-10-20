package com.example.ttrgamestate;

import android.view.View;

//this class holds the different action a player can take and prints them to the multiline text view
public class TTRLocalGame implements View.OnClickListener{
    private TTRHumanPlayer view;
    TTRLocalGame(TTRHumanPlayer play){
        view = play;
    }

    @Override
    public void onClick(View view) {

    }
}
