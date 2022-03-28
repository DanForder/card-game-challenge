package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CardGame cardGame = new CardGame("the good game");

        cardGame.shuffleDeck();
        cardGame.getDeck();
    }
}
