package com.example.ttrgamestate;

public class Path {

    public enum COLOR{
        PINKPATH,
        ORANGEPATH,
        BLACKPATH,
        WHITEPATH,
        GRAYPATH,
    }



    private int length;
    private String node0;
    private String node1;
    private COLOR pathColor;
    private int pathOwner;//NUMBER


    public Path(int length, String node0, String node1, COLOR col, int owner){
        this.length = length;
        this.node0 = node0;
        this.node1 = node1;
        pathColor = col;
        pathOwner = owner;

    }


}
