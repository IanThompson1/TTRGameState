package com.example.ttrgamestate;


public class Ticket {
    private int PointValue;
    private String node0;
    private String node1;
    public boolean isComplete;

    public Ticket(int value, String n0, String n1){
        isComplete = false;
        PointValue = value;
        node0 = n0;
        node1 = n1;
    }
}
