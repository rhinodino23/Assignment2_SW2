package com.company;

public class Frames {
    public int getScore()
    {
        return theScore;
    }
    public void add( int pins)
    {
        theScore+=pins;
    }
    private int theScore = 0;
}
