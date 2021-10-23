package com.example.ttrgamestate;
//ticket class implemented by Ian Thompson, Bruce Baird, Trent Matsushima, and Jennifer Brana

public class Ticket {
    private int PointValue;
    private TTRGameState.CITY node0;
    private TTRGameState.CITY node1;
    public boolean isComplete;

    //constructor for Ticket object
    public Ticket(int value, TTRGameState.CITY n0, TTRGameState.CITY n1){
        isComplete = false;
        PointValue = value;
        node0 = n0;
        node1 = n1;
    }

    //copy constructor for ticket object
    public Ticket(Ticket t){
        this.isComplete = t.isComplete;
        this.PointValue = t.PointValue;
        this.node0 = t.node0;
        this.node1 = t.node1;
    }

    //method to check if the ticket has been completed by a user
    public boolean getIsComplete(){
        return isComplete;
    }

    //method to return the points value of a ticket
    public int getPointValue(){
        return PointValue;
    }

    //method to get the first city on the ticket
    public TTRGameState.CITY getNode0(){
        return node0;
    }

    //method to get the second city on the ticket
    public TTRGameState.CITY getNode1(){
        return node1;
    }

}
