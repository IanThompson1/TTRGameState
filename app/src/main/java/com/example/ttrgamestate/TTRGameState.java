package com.example.ttrgamestate;
import java.util.ArrayList;

public class TTRGameState{

    public enum card{
        whiteCard,
        blackCard,
        pinkCard,
        orangeCard,
        wildCard,
    }

    public enum path{
        portlandToSalem,
        placedestination,

    }

    private ArrayList<path> allPaths;


    private int numPlayers;


    public TTRGameState(){

    }

    public TTRGameState(TTRGameState other){
        //copies everything
        // same number of :new”s
    }

    public boolean placeTrains(path p, Path.owner own){

        switch(p){
            case portlandToSalem:
                System.out.println("PtoS");
                return true;
        }
        return false;
    }

    public String toString(){
        return "hi";
    }


}
