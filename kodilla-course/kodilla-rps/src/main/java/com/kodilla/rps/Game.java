package com.kodilla.rps;

import java.util.Scanner;

public class Game {

    private String username;
    private int rounds;

    public Game(String username, int rounds) {
        this.username = username;
        this.rounds = rounds;
    }

    public void getInfo() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name:");
        username = in.next();

        System.out.println("Enter number of rounds you want to play:");
        rounds = in.nextInt();
    }
}

