package com.example.ttrgamestate;

public class Path {

    public enum COLOR{
        PINKPATH,
        ORANGEPATH,
        BLACKPATH,
        WHITEPATH,
        GRAYPATH,
    }

    public enum OWNER{
        REDPLAYER,
        GREENPLAYER,
        YELLOWPLAYER,
        BLUEPLAYER,
    }

    private int length;
    private int[] node0;
    private int[] node1;
    private COLOR pathColor;
    private int pathOwner;//NUMBER


    public Path(int length, int[] node0, int[] node1, COLOR col, int owner){
        this.length = length;
        this.node0 = node0;
        this.node1 = node1;
        pathColor = col;
        pathOwner = owner;

    }


}
