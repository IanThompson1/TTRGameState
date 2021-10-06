package com.example.ttrgamestate;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class TTRGameState{

    public enum CARD{
        WHITECARD,
        BLACKCARD,
        PINKCARD,
        ORANGECARD,
        WILDCARD,
    }

    public int whosTurn;

    private ArrayList<Path> allPaths;
    private ArrayList<Player> allPlayers;

    private ArrayList<CARD> cardDeck;
    private ArrayList<CARD> faceUp;
    private ArrayList<Ticket> ticketDeck;

    private int numPlayers;


    public TTRGameState(int inNumPlayers){

        //set number of players
        numPlayers = inNumPlayers;
        whosTurn = 0;

        /**
         * create all paths
         */
        //orange paths
        allPaths.add(new Path(1, "Astoria", "Tillamook", Path.COLOR.ORANGEPATH, -1));



        //create all players
        allPlayers.add(new Player(0));
        allPlayers.add(new Player(1));

        if (numPlayers > 2){
            //3 players
            allPlayers.add(new Player(2));
            if (numPlayers == 4){
                //four players
                allPlayers.add(new Player(3));
            }
        }


        //create all

    }

    public TTRGameState(TTRGameState other){
        //copies everything
        // same number of :new's

    }



    public String toString(){
        return "hi";
    }


}
