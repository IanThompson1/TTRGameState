package com.example.ttrgamestate;
import java.util.ArrayList;


public class Player {

    private int numTrains;
    private ArrayList<TTRGameState.CARD> cardHand;
    private ArrayList<Ticket> tickets;
    private int name;  //name


    public Player(int playerNum){
        name = playerNum;
        cardHand = new ArrayList<TTRGameState.CARD>();
        this.tickets = new ArrayList<Ticket>();
        numTrains = 20;
    }

    //Copy constructor
    public Player(Player p){
        this.name = p.name;
        this.cardHand = p.cardHand;
        this.tickets = p.tickets;
        this.numTrains = p.numTrains;
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

    public void addCardHand(TTRGameState.CARD card) {
        cardHand.add(card);
    }

    public void removeCardHand(TTRGameState.CARD card){
        cardHand.remove(card);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
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


}
