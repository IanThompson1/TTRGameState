package com.example.ttrgamestate;
import java.util.ArrayList;


public class Player {

    private int numTrains;
    private ArrayList<TTRGameState.CARD> cardHand;
    private ArrayList<Ticket> tickets;
    private int name;  //name


    //Player constructor
    public Player(int playerNum){
        name = playerNum;
        cardHand = new ArrayList<TTRGameState.CARD>();
        this.tickets = new ArrayList<Ticket>();
        numTrains = 20;
    }

    //Copy constructor
    public Player(Player p){
        this.name = p.name;

        this.cardHand = new ArrayList<TTRGameState.CARD>(p.cardHand.size());
        for(TTRGameState.CARD c: p.cardHand){
            this.cardHand.add(c);
        }

        this.tickets = new ArrayList<Ticket>(p.tickets.size());
        for(Ticket t: p.tickets){
            this.tickets.add(t);
        }

        this.numTrains = p.numTrains;
    }

    //method to get the number of trains a player has
    public int getNumTrains(){
        return numTrains;
    }

    //method to the players name
    public int getName(){
        return name;
    }

    //method to access the cardHand a player has
    public ArrayList<TTRGameState.CARD> getCardHand(){
        return cardHand;
    }

    //method to get the tickets a player has
    public ArrayList<Ticket> getTickets(){
        return tickets;
    }

    //method to add a card to a players cardHand.
    public void addCardHand(TTRGameState.CARD card) {
        cardHand.add(card);
    }

    //method to remove a card from a players cardHand.
    public void removeCardHand(TTRGameState.CARD card){
        cardHand.remove(card);
    }

    //method to give a player a ticket.
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    //method to get the number of orange cards a player has
    public int getOrangeCards() {
        int orangeCards = 0;
        for(int i = 0; i < cardHand.size(); i++){
            if(cardHand.get(i) == TTRGameState.CARD.ORANGECARD){
                orangeCards++;
            }
        }
        return orangeCards;
    }

    //method to get the number of black cards a player has
    public int getBlackCards() {
        int blackCards = 0;
        for(int i = 0; i < cardHand.size(); i++){
            if(cardHand.get(i) == TTRGameState.CARD.BLACKCARD){
                blackCards++;
            }
        }
        return blackCards;
    }

    //method to get the number of pink cards a player has
    public int getPinkCards() {
        int pinkCards = 0;
        for(int i = 0; i < cardHand.size(); i++){
            if(cardHand.get(i) == TTRGameState.CARD.PINKCARD){
                pinkCards++;
            }
        }
        return pinkCards;
    }

    //method to get the number of white cards a player has
    public int getWhiteCards() {
        int whiteCards = 0;
        for(int i = 0; i < cardHand.size(); i++){
            if(cardHand.get(i) == TTRGameState.CARD.WHITECARD){
                whiteCards++;
            }
        }
        return whiteCards;
    }

    //method to get the number of wild cards a player has
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
