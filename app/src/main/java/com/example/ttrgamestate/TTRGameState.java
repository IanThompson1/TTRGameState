package com.example.ttrgamestate;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
//ticket to ride game state implemented by Ian Thompson, Bruce Baird, Trent Matsushima, and Jennifer Brana
public class TTRGameState{

    public enum CARD{
        WHITECARD,
        BLACKCARD,
        PINKCARD,
        ORANGECARD,
        WILDCARD,
    }

    public enum CITY{
        ASTORIA,
        TILLAMOOK,
        NEWPORT,
        COOSBAY,
        PORTLAND,
        SALEM,
        EUGENE,
        ROSEBURG,
        GPASS,
        THEDALLES,
        BEND,
        KFALLS,
        PENDLETON,
        LAGRANDE,
        BURNS,
        LAKEVIEW
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
         * Path(length, node0, node1, color, owner)
         */
        //orange paths
        allPaths = new ArrayList<Path>();
        allPaths.add(new Path(1, CITY.ASTORIA, CITY.TILLAMOOK,
                Path.COLOR.ORANGEPATH, -1));
        allPaths.add(new Path(2, CITY.PORTLAND, CITY.THEDALLES,
                Path.COLOR.ORANGEPATH, -1));
        allPaths.add(new Path(2, CITY.SALEM, CITY.EUGENE,
                Path.COLOR.ORANGEPATH, -1));
        allPaths.add(new Path(1, CITY.PENDLETON, CITY.LAGRANDE,
                Path.COLOR.ORANGEPATH, -1));
        allPaths.add(new Path(4, CITY.LAGRANDE, CITY.BURNS,
                Path.COLOR.ORANGEPATH, -1));
        allPaths.add(new Path(2, CITY.GPASS, CITY.KFALLS,
                Path.COLOR.ORANGEPATH, -1));


        //Pink Paths
        allPaths.add(new Path(1, CITY.TILLAMOOK, CITY.PORTLAND,
                Path.COLOR.PINKPATH, -1));
        allPaths.add(new Path(2, CITY.PORTLAND, CITY.THEDALLES,
                Path.COLOR.PINKPATH, -1));
        allPaths.add(new Path(3, CITY.COOSBAY, CITY.NEWPORT,
                Path.COLOR.PINKPATH, -1));
        allPaths.add(new Path(2, CITY.EUGENE, CITY.BEND,
                Path.COLOR.PINKPATH, -1));
        allPaths.add(new Path(4, CITY.BEND, CITY.PENDLETON,
                Path.COLOR.PINKPATH, -1));
        allPaths.add(new Path(3, CITY.LAKEVIEW, CITY.BURNS,
                Path.COLOR.PINKPATH, -1));


        //Black Paths
        allPaths.add(new Path(1, CITY.TILLAMOOK, CITY.PORTLAND,
                Path.COLOR.BLACKPATH, -1));
        allPaths.add(new Path(3, CITY.THEDALLES, CITY.PENDLETON,
                Path.COLOR.BLACKPATH, -1));
        allPaths.add(new Path(1, CITY.PENDLETON, CITY.LAGRANDE,
                Path.COLOR.BLACKPATH, -1));
        allPaths.add(new Path(2, CITY.SALEM, CITY.EUGENE,
                Path.COLOR.BLACKPATH, -1));
        allPaths.add(new Path(4, CITY.BEND, CITY.KFALLS,
                Path.COLOR.BLACKPATH, -1));
        allPaths.add(new Path(2, CITY.COOSBAY, CITY.GPASS,
                Path.COLOR.BLACKPATH, -1));


        //White Paths
        allPaths.add(new Path(1, CITY.ASTORIA, CITY.TILLAMOOK,
                Path.COLOR.WHITEPATH, -1));
        allPaths.add(new Path(3, CITY.THEDALLES, CITY.PENDLETON,
                Path.COLOR.WHITEPATH, -1));
        allPaths.add(new Path(3, CITY.SALEM, CITY.BEND,
                Path.COLOR.WHITEPATH, -1));
        allPaths.add(new Path(2, CITY.NEWPORT, CITY.EUGENE,
                Path.COLOR.WHITEPATH, -1));
        allPaths.add(new Path(1, CITY.COOSBAY, CITY.ROSEBURG,
                Path.COLOR.WHITEPATH, -1));
        allPaths.add(new Path(2, CITY.KFALLS, CITY.LAKEVIEW,
                Path.COLOR.WHITEPATH, -1));


        //Gray Paths
        allPaths.add(new Path(2, CITY.ASTORIA, CITY.PORTLAND,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(2, CITY.ASTORIA, CITY.PORTLAND,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(1, CITY.SALEM, CITY.PORTLAND,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(1, CITY.SALEM, CITY.PORTLAND,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(3, CITY.THEDALLES, CITY.BEND,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(3, CITY.THEDALLES, CITY.BEND,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(1, CITY.TILLAMOOK, CITY.NEWPORT,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(1, CITY.TILLAMOOK, CITY.NEWPORT,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(2, CITY.EUGENE, CITY.ROSEBURG,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(2, CITY.EUGENE, CITY.ROSEBURG,
                Path.COLOR.GREYPATH, -1));
        //single greys
        allPaths.add(new Path(1, CITY.ROSEBURG, CITY.GPASS,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(3, CITY.ROSEBURG, CITY.KFALLS,
                Path.COLOR.GREYPATH, -1));
        allPaths.add(new Path(3, CITY.BEND, CITY.BURNS,
                Path.COLOR.GREYPATH, -1));


        /**
         * Creates all players
         * Player(playerNum)
         */
        allPlayers = new ArrayList<Player>();

        allPlayers.add(new Player(0));
        allPlayers.add(new Player(1));

        if (numPlayers > 2){
            //three players
            allPlayers.add(new Player(2));
            if (numPlayers == 4){
                //four players
                allPlayers.add(new Player(3));
            }
        }


        //create ticket deck
        ticketDeck = new ArrayList<Ticket>();
        ticketDeck.add(new Ticket(8,CITY.ASTORIA,CITY.LAGRANDE));
        ticketDeck.add(new Ticket(5,CITY.ASTORIA,CITY.COOSBAY));
        ticketDeck.add(new Ticket(5,CITY.TILLAMOOK,CITY.BEND));
        ticketDeck.add(new Ticket(7,CITY.TILLAMOOK,CITY.GPASS));
        ticketDeck.add(new Ticket(6,CITY.PENDLETON,CITY.SALEM));
        ticketDeck.add(new Ticket(8,CITY.EUGENE,CITY.LAKEVIEW));
        ticketDeck.add(new Ticket(8,CITY.THEDALLES,CITY.KFALLS));
        ticketDeck.add(new Ticket(9,CITY.NEWPORT,CITY.BURNS));
        ticketDeck.add(new Ticket(5,CITY.PORTLAND,CITY.BEND));
        ticketDeck.add(new Ticket(5,CITY.ROSEBURG,CITY.PORTLAND));
        ticketDeck.add(new Ticket(10,CITY.PENDLETON,CITY.KFALLS));
        ticketDeck.add(new Ticket(13,CITY.LAGRANDE,CITY.GPASS));
        ticketDeck.add(new Ticket(6,CITY.COOSBAY,CITY.BEND));

        /**
         * Card face up and down deck
         *
         */
        cardDeck = new ArrayList<CARD>();
        faceUp = new ArrayList<CARD>();
        for (int i = 0; i < 12; i++) {
            cardDeck.add(CARD.ORANGECARD);
        }
        for (int i = 0; i < 12; i++) {
            cardDeck.add(CARD.PINKCARD);
        }
        for (int i = 0; i < 12; i++) {
            cardDeck.add(CARD.BLACKCARD);
        }
        for (int i = 0; i < 12; i++) {
            cardDeck.add(CARD.WHITECARD);
        }
        for (int i = 0; i < 14; i++) {
            cardDeck.add(CARD.WILDCARD);
        }
        Collections.shuffle(cardDeck);

        //sets up face up card deck
        for (int i = 0; i < 5; i++){
            faceUp.add(cardDeck.get(0));
            cardDeck.remove(0);
        }


        //create tickets

    }

    public TTRGameState(TTRGameState other){
        //copies everything
        // same number of :new's

    }

    //getter method for cardDeck
    public ArrayList<CARD> getCardDeck() {
        return cardDeck;
    }

    //setter method for cardDeck
    public void setCardDeck(ArrayList<CARD> cardDeck1){
        cardDeck.clear();
        cardDeck.addAll(cardDeck1);
    }

    public Ticket[] getTickets(){
        Ticket[] tickets = new Ticket[3];
        for(int i = 0; i < 3; i++){
            tickets[i] = ticketDeck.get(i);
            ticketDeck.remove(i);
        }
        return tickets;
    }

    public boolean ticketDeckEmpty(){
        return ticketDeck.isEmpty();
    }



    public String toString(){
        String output = "";
        //strings for the paths
        output += "length\tnode0\tnode1\tpath color\tpath owner\n";
        for(Path current: allPaths) {
            output += current.getLength() + "\t";
            output += current.getNode0().name() + "\t";
            output += current.getNode1().name() + "\t";
            output += current.getPathColor().name() + "\t";
            output += current.getPathOwner() + "\t\n";
        }

        //strings for the tickets
        output += "is complete\tpoint value\tnode0\tnode1\n";
        for(Ticket current: ticketDeck){
            output += current.getIsComplete() + "\t";
            output += current.getPointValue() + "\t";
            output += current.getNode0().name() + "\t";
            output += current.getNode1().name() + "\t\n";
        }

        //strings for the players
        output += "player name\ttrains left\n";
        for(Player current: allPlayers) {
            output += current.getName() + "\t";
            output += current.getNumTrains() + "\t\n";

            //string for players tickets
            output += "TICKETS:\t";
            for (Ticket tik : current.getTickets()) {
                output += tik.getIsComplete() + "\t";
                output += tik.getPointValue() + "\t";
                output += tik.getNode0().name() + "\t";
                output += tik.getNode1().name() + "\t";
            }
            output += "\n";

            //string for players cards
            output += "CARDS:\t";
            for(CARD card:current.getCardHand()){
                output += card.name() + "\t";
            }
            output += "\n";
        }

        return output;
    }


}
