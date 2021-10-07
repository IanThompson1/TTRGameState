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

    public boolean getIsComplete(){
        return isComplete;
    }

    public int getPointValue(){
        return PointValue;
    }

    public TTRGameState.CITY getNode0(){
        return node0;
    }

    public TTRGameState.CITY getNode1(){
        return node1;
    }

}
