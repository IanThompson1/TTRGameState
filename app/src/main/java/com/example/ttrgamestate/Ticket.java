package com.example.ttrgamestate;


public class Ticket {
    private int PointValue;
    private TTRGameState.CITY node0;
    private TTRGameState.CITY node1;
    public boolean isComplete;

    public Ticket(int value, TTRGameState.CITY n0, TTRGameState.CITY n1){
        isComplete = false;
        PointValue = value;
        node0 = n0;
        node1 = n1;
    }
}
