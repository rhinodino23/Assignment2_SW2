package com.company;

public class Scorer {
    public void addThrow(int pins)
    {
        theThrow[theCurrentFrame++]= pins;
    }
    public int scorePerFrame(int frame)
    {
        ball = 0;
        int score = 0;
        for (int currentFrameNum = 0; currentFrameNum < frame; currentFrameNum++)
        {
            if(strike())
            {
                score += 10 + nextTwoBalls();
            }
            else if (spare())
            {
                score += 10 + nextBall();
            }
            else {
                score += twoBallsPerFrame();
            }
        }
        return score;
    }

    private boolean strike()
    {
        if (theThrow[ball]==10)
        {
            ball++;
            return true;
        }
        return false;
    }
    private int nextTwoBalls()
    {
        return theThrow[ball] + theThrow[ball+1];
    }
    private boolean spare()
    {
        if (theThrow[ball] + theThrow[ball+1] == 10)
        {
            ball+=2;
            return true;
        }
        return false;
    }
    private int nextBall()
    {
        return theThrow[ball];
    }
    private int twoBallsPerFrame()
    {
        return theThrow[ball++] + theThrow[ball++];
    }

    private int ball;
    private int[] theThrow = new int[21];
    private int theCurrentFrame = 0;
}
