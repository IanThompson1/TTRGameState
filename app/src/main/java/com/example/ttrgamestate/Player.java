package com.example.ttrgamestate;
import java.util.ArrayList;
//player class implemented by Ian Thompson, Bruce Baird, Trent Matsushima, and Jennifer Brana

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


    public Player(int playerNum, ArrayList<TTRGameState.CARD> cards, ArrayList<Ticket> tickets, int trains){
        name = playerNum;
        cardHand = cards;
        this.tickets = tickets;
        numTrains = trains;
    }

    public int getNumTrains(){
        return numTrains;
    }

    public int getName(){
        return name;
    }

    public ArrayList<TTRGameState.CARD> getCardHand(){
        return cardHand;
    }

    public ArrayList<Ticket> getTickets(){
        return tickets;
    }

}
