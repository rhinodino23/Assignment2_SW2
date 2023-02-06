package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
/*
    @Test
    void score() {
    }

    @Test
    void add() {
    }

    @Test
    void scorePerFrame() {
    }
*/
  /*  public GameTest (String name)
    {
        super(name);
    }*/
    private Game g;
    public void setUp()
    {
        g = new Game();
    }
    /*@Test
    public void testingThrow()
    {
        g.add(5);
        assertEquals(5, g.score());
        assertEquals(1, g.getCurrentFrame());
    }*/
    /*@Test
    public void testing2throws()
    {
        Game g = new Game();
        g.add(5);
        g.add(4);
        assertEquals(9,g.score());
    }
    @Test
    public void  testing4throws()
    {
        Game g = new Game();
        g.add(5);
        g.add(4);
        g.add(7);
        g.add(2);
        assertEquals(18, g.score());
        assertEquals(9, g.scorePerFrame(1));
        assertEquals(18, g.scorePerFrame(2));
       *//* assertEquals(2, g.getCurrentFrame());
        assertEquals(3, g.getCurrentFrame());*//*
    }
    @Test
    public void testSpare()
    {
        Game g = new Game();
        g.add(3);
        g.add(7);
        g.add(3);
        assertEquals(13, g.scorePerFrame(1));
    }
    @Test
    public void testAfterSpare()
    {
        setUp();
        g.add(3);
        g.add(7);
        g.add(3);
        g.add(2);
        assertEquals(13, g.scorePerFrame(1));
        assertEquals(18, g.scorePerFrame(2));
        assertEquals(18, g.score());

    }
    @Test
    public void testOfStrikes()
    {
        setUp();
        g.add(10);
        g.add(3);
        g.add(6);
        assertEquals(19,g.scorePerFrame(1));
        assertEquals(28, g.score());

    }*/
    @Test
    public void testingOfAllStrikes()
    {
        setUp();
        for (int i =0; i<12;i++)
        {
            g.add(10);
        }
        assertEquals(300, g.score());
        System.out.println("Score with all Strikes:");
        System.out.println(g.score());
    }
    /*@Test
    public void testingForTheEndOfAnArray()
    {
        setUp();
        for (int i=0; i<9; i++)
        {
            g.add(0);
            g.add(0);
        }
        g.add(2);
        g.add(8);
        g.add(10);
        assertEquals(20, g.score());
    }
    @Test
    public void testSampleGame()
    {
        setUp();
        g.add(1);
        g.add(4);
        g.add(4);
        g.add(5);
        g.add(6);
        g.add(4);
        g.add(5);
        g.add(5);
        g.add(10);
        g.add(0);
        g.add(1);
        g.add(7);
        g.add(3);
        g.add(6);
        g.add(4);
        g.add(10);
        g.add(2);
        g.add(8);
        g.add(6);
        assertEquals(133, g.score());
    }
    @Test
    public void frameTenSpare()
    {
        setUp();
        for(int i =0; i<9; i++)
            g.add(10);
        g.add(9);
        g.add(1);
        g.add(1);
        assertEquals(270, g.score());
    }*/
    @Test
    public void testingOfAllGutters()
    {
        setUp();
        for (int i =0; i<12;i++)
        {
            g.add(0);
        }
        assertEquals(0, g.score());
        System.out.println("Score with all Gutter Balls:");
        System.out.println(g.score());
    }

    @Test
    public void testOfSpares()
    {
        setUp();
        for (int i =0; i<11;i++)
        {
            g.add(15);
        }

        System.out.println("Score with all Spares:");
        System.out.println(g.score());
        assertEquals(150, g.score());
    }
    @Test
    public void testSampleGameMine()
    {
        setUp();
        g.add(8);
        g.add(1);

        g.add(6);
        g.add(3);

        g.add(5);
        g.add(5);

        g.add(4);
        g.add(3);

        g.add(8);
        g.add(1);

        g.add(1);
        g.add(4);

        g.add(5);
        g.add(4);

        g.add(9);
        g.add(1);

        g.add(10);

        g.add(9);
        g.add(1);
        g.add(6);
        assertEquals(118, g.score());
        System.out.println("My Sample Game:");
        System.out.println(g.score());
    }
}