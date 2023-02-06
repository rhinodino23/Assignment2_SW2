package com.company;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    Game rounds = new Game();
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Welcome to bowling.");

    }
    public void testingOfAllStrikes()
    {

        for (int i =0; i<12;i++)
        {
            rounds.add(10);
        }
        //assertEquals(300, rounds.score());
        System.out.println(rounds.score());
    }
}

