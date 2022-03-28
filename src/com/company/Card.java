package com.company;

import java.util.Objects;

public class Card {
    public static final String ANSI_BRIGHT_RED = "\u001b[31;1m";
    public static final String ANSI_BLACK = "\033[0;30m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE_BACKGROUND = "\033[47m";

    private String suit;
    private String symbol;
    private int value;

    public Card(String suit, String symbol, int value) {
        this.suit = suit;
        this.symbol = symbol;
        this.value = value;
    }

    public boolean isRed() {
        return Objects.equals(this.suit, "\u2665") || Objects.equals(this.suit, "\u2666");
    }

    @Override
    public String toString() {
        String colourFormat = ANSI_BLACK + ANSI_WHITE_BACKGROUND;
        if (isRed()) {
            colourFormat = ANSI_BRIGHT_RED;
        }
        return colourFormat + symbol + " of " + suit + ". Worth " + value + ANSI_RESET;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
