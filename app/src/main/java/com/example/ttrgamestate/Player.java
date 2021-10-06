package com.example.ttrgamestate;
import java.util.ArrayList;


public class Player {


//    public enum OWNER{
//        REDPLAYER,
//        GREENPLAYER,
//        YELLOWPLAYER,
//        BLUEPLAYER,
//    }

    private int numTrains;
    private ArrayList<TTRGameState.CARD> cardHand;
    private ArrayList<Ticket> tickets;
    private int name;  //name


    public Player(int playerNum){
        name = playerNum;
    }

}
