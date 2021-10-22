package com.example.ttrgamestate;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

//this class holds the different action a player can take and prints them to the multiline text view
public class TTRLocalGame implements View.OnClickListener{
    private TTRHumanPlayer view;
    private EditText testing;
    TTRLocalGame(TTRHumanPlayer play){
        view = play;
    }

    public void ViewOnClick(EditText ctv){
        testing = ctv;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.runTest){
            TTRGameState firstInstance = new TTRGameState(4);
            testing.setText(firstInstance.toString());
        }
    }
}
