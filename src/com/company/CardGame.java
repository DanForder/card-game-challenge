package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class CardGame {
    private final String[] suits = {"\u2665", "\u2663", "\u2666", "\u2660"};
    private final String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    private ArrayList<Card> deckOfCards;
    private String name;

    public CardGame(String name) {
        this.name = name;
        this.deckOfCards = generateDeck();
    }

    private ArrayList<Card> generateDeck() {
        var deck = new ArrayList<Card>();
        for (String suit : suits) {
            for (int i = 0; i < symbols.length; i++) {
                String symbol = symbols[i];
                int value = values[i];
                deck.add(new Card(suit, symbol, value));
            }
        }
        return deck;
    }

    public Card dealCard() {
        return deckOfCards.remove(0);
    }

    public void sortDeckInNumberOrder() {
        ArrayList<Card> newDeck = new ArrayList<>();

        for (int value : values) {
            for (Card card : deckOfCards) {
                if (card.getValue() == value) {
                    newDeck.add(card);
                }
            }
        }

        this.deckOfCards = newDeck;
    }


    public void sortDeckInSuitOrder() {
        // first sort in number order
        sortDeckInNumberOrder();

        ArrayList<Card> newDeck = new ArrayList<>();

        for (String suit : suits) {
            for (Card card : deckOfCards) {
                if (Objects.equals(card.getSuit(), suit)) {
                    newDeck.add(card);
                }
            }
        }

        this.deckOfCards = newDeck;
    }

    public void shuffleDeck() {
        Collections.shuffle(deckOfCards);
    }

    public void getDeck() {
        for (Card card : deckOfCards) {
            System.out.println(card);
        }
    }

    public ArrayList<Card> getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(ArrayList<Card> deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
