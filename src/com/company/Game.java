package com.company;

public class Game {
    public int score()
    {
        return scorePerFrame(theCurrentFrame);
    }
    /*public int getCurrentFrame()
    {
        return theCurrentFrame;
    }*/

    public void add(int pins)
    {
        pointScores.addThrow(pins);
        updateCurrentFrame(pins);
    }
    private void updateCurrentFrame(int pins)
    {
        if (initialThrow == true)
        {
            if(adjustFrameStrikes(pins) == false)// strike case
            {
                initialThrow = false;
            }
        }
        else
        {
            initialThrow = true;
            advanceFrame();
        }
       // theCurrentFrame = Math.min(11,theCurrentFrame); // moved to advanceFrame
        // Had to move to 11 because it goes 1 less than int provided.
    }
    private void advanceFrame()
    {
        theCurrentFrame = Math.min(10, theCurrentFrame + 1);
    }
    public int scorePerFrame(int frame)
    {
        return pointScores.scorePerFrame(frame);
    }
    private boolean adjustFrameStrikes(int pins)
    {
        if (pins == 10)
        {
            advanceFrame();
            return true;
        }
        return false;
    }

    //private int ball;
    //private int throw1, throw2;

   // private int theScore = 0;
   // private int[] theThrow = new int[21];
   // private int currentThrow = 0;
    private int theCurrentFrame = 0;
    private boolean initialThrow = true;
    private Scorer pointScores = new Scorer();
}
