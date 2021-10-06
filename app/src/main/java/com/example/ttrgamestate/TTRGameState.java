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


        //create tickets
        ticketDeck.add(new Ticket(0,"Portland","Salem"));

    }

    public TTRGameState(TTRGameState other){
        //copies everything
        // same number of :new's

    }



    public String toString(){
        return "hi";
    }


}
