/*public class TestingGame extends rollTesting{
    public TestingGame(String pin)
    {
        super(pin);
    }
    private com.company.Game g;
    public void setUp()
    {
        g = new com.company.Game();
    }
    public void testingThrow()
    {
        g.add(5);
        assertEquals(5, g.score());
        assertEquals(1, g.getCurrentFrame());
    }
    public void testing2throws()
    {
        com.company.Game g = new com.company.Game();
        g.add(5);
        g.add(4);
        assertEquals(9,g.score());
        assertEquals(1, g.getCurrentFrame());
        assertEquals(2, g.getCurrentFrame());
    }
    public void  testing4throws()
    {
        com.company.Game g = new com.company.Game();
        g.add(5);
        g.add(4);
        g.add(7);
        g.add(2);
        assertEquals(18, g.score());
        assertEquals(9, g.score(1));
        assertEquals(18, g.score(2));
        assertEquals(2, g.getCurrentFrame());
        assertEquals(3, g.getCurrentFrame());
    }
    public void testSpare()
    {
        g.add(3);
        g.add(7);
        g.add(3);
        assertEquals(13, g.scorePerFrame());
        assertEquals(2, g.getCurrentFrame());
    }
    public void testAfterSpare()
    {
        g.add(3);
        g.add(7);
        g.add(3);
        g.add(2);
        assertEquals(13, g.scorePerFrame(1));
        assertEquals(18, g.scorePerFrame(2));
        assertEquals(18, g.score());
        assertEquals(3, g.getCurrentFrame());
    }
    public void testOfStrikes()
    {
        g.add(10);
        g.add(3);
        g.add(6);
        assertEquals(19,g.scorePerFrame(1));
        assertEquals(28, g.score());
        assertEquals(3, g.getCurrentFrame());
    }

    public void testingOfAllStrikes()
    {
        for (int i =0; i<12;i++)
        {
            g.add(10);
        }
        assertEquals(300, g.score());
        assertEquals(11, g.getCurrentFrame());
    }
    public void testingForTheEndOfAnArray()
    {
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
    public void testSampleGame()
    {
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
    public void frameTenSpare()
    {
        for(int i =0; i<9; i++)
            g.add(10);
        g.add(9);
        g.add(1);
        g.add(1);
        assertEquals(270, g.score());
    }
}*/
