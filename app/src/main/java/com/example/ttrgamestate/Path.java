package com.example.ttrgamestate;

public class Path {

    public enum color{
        green,
    }

    public enum owner{
        empty,
        player1,
    }

    private int length;
    private int[] node0;
    private int[] node1;
    private color pathColor;
    private owner pathOwner;


    public Path(int length, int[] node0, int[] node1, color col, owner own){
        this.length = length;
        this.node0 = node0;
        this.node1 = node1;
        pathColor = col;
        pathOwner = own;

    }


}
