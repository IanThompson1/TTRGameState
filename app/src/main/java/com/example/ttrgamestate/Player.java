package com.example.ttrgamestate;
import java.util.ArrayList;


public class Player {


    public enum OWNER {
        REDPLAYER,
        GREENPLAYER,
        YELLOWPLAYER,
        BLUEPLAYER,
    }

    private int numTrains;
    private ArrayList<TTRGameState.CARD> cardHand;
    private ArrayList<Ticket> tickets;
    private int color;  //name



    public Player(int playerNum) {
        color = playerNum;
    }

    public ArrayList<TTRGameState.CARD> getCardHand() {
        return cardHand;
    }

    public void addCardHand(TTRGameState.CARD card) {
        cardHand.add(card);
    }

    public void removeCardHand(TTRGameState.CARD card){
        cardHand.remove(card);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public int getColor() {
        return color;
    }

    public int getOrangeCards() {
        int orangeCards = 0;
        for(int i = 0; i < cardHand.size(); i++){
            if(cardHand.get(i) == TTRGameState.CARD.ORANGECARD){
                orangeCards++;
            }
        }
        return orangeCards;
    }

    public int getBlackCards() {
        int blackCards = 0;
        for(int i = 0; i < cardHand.size(); i++){
            if(cardHand.get(i) == TTRGameState.CARD.BLACKCARD){
                blackCards++;
            }
        }
        return blackCards;
    }

    public int getPinkCards() {
        int pinkCards = 0;
        for(int i = 0; i < cardHand.size(); i++){
            if(cardHand.get(i) == TTRGameState.CARD.PINKCARD){
                pinkCards++;
            }
        }
        return pinkCards;
    }

    public int getWhiteCards() {
        int whiteCards = 0;
        for(int i = 0; i < cardHand.size(); i++){
            if(cardHand.get(i) == TTRGameState.CARD.WHITECARD){
                whiteCards++;
            }
        }
        return whiteCards;
    }

    public int getWildCards() {
        int wildCards = 0;
        for(int i = 0; i < cardHand.size(); i++){
            if(cardHand.get(i) == TTRGameState.CARD.WILDCARD){
                wildCards++;
            }
        }
        return wildCards;
    }

    public int getNumTrains() {
        return numTrains;
    }


}
