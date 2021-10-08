package com.example.ttrgamestate;

public class Path {

    public enum COLOR{
        PINKPATH,
        ORANGEPATH,
        BLACKPATH,
        WHITEPATH,
        GREYPATH,
    }



    private int length;
    private TTRGameState.CITY node0;
    private TTRGameState.CITY node1;
    private COLOR pathColor;
    private int pathOwner;//NUMBER


    public Path(int length, TTRGameState.CITY node0, TTRGameState.CITY node1, COLOR col, int owner){
        this.length = length;
        this.node0 = node0;
        this.node1 = node1;
        pathColor = col;
        pathOwner = owner;

    }

    //copy constructor
    public Path(Path p){
        this.length = p.length;
        this.node0 = p.node0;
        this.node1 = p.node1;
        this.pathColor = p.pathColor;
        this.pathOwner = p.pathOwner;
    }

    public int getLength(){
        return length;
    }

    public TTRGameState.CITY getNode0(){
        return node0;
    }

    public TTRGameState.CITY getNode1(){
        return node1;
    }

    public COLOR getPathColor(){
        return pathColor;
    }

    public int getPathOwner(){
        return pathOwner;
    }
    public void setPathOwner(int owner){
        pathOwner = owner;
    }

}
