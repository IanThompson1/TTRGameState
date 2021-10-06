package com.example.ttrgamestate;
import java.util.ArrayList;


public class Player {


    public enum OWNER{
        REDPLAYER,
        GREENPLAYER,
        YELLOWPLAYER,
        BLUEPLAYER,
    }

    private int numTrains;
    private ArrayList<TTRGameState.CARD> cardHand;
    private ArrayList<Ticket> tickets;
    private int color;  //name


    public Player(int playerNum){
        color = playerNum;

    }

}
