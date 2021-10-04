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


    public TTRGameState(){

    }

    public TTRGameState(TTRGameState other){
        //copies everything
        // same number of :new”s
    }



    public String toString(){
        return "hi";
    }


}
