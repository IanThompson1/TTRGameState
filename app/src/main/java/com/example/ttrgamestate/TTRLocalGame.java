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
            //a new instance of a game state class with a default constructor
            TTRGameState firstInstance = new TTRGameState(4);
            //prints out firstInstance to the EditText
            testing.setText(firstInstance.toString());
            //creates a deep copy of firstInstance
            //and assigns it to a var named secondInstance
            TTRGameState secondInstance = new TTRGameState(firstInstance);
            TTRGameAction actions = new TTRGameAction();
            //using firstInstance we will test our game
            //by playing over three moves
            actions.drawTrain(firstInstance.getPlayer1(), TTRGameState.CARD.ORANGECARD, TTRGameState.CARD.WILDCARD, firstInstance);
            //then append the updated game state after every action
            testing.append("draw train action\n");
            testing.append(firstInstance.toString());
            actions.placeTrains(firstInstance.getPlayer1(), firstInstance.getPath(), 1 , TTRGameState.CARD.ORANGECARD);
            testing.append("place train action\n");
            testing.append(firstInstance.toString());
            actions.drawTicket(firstInstance.getPlayer1(), firstInstance);
            testing.append("draw ticket action\n");
            testing.append(firstInstance.toString());
            //create a new instance of the game state using default constructor
            TTRGameState thirdInstance = new TTRGameState(4);
            //This will append both secondInstance and thirdInstance game states
            //if done correctly the two Strings should be identitcal.
            testing.append("Second Instance\n");
            testing.append(secondInstance.toString());
            testing.append("Third Instance\n");
            testing.append(thirdInstance.toString());


        }
    }
}
