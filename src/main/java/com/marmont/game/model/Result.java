package com.marmont.game.model;

public enum Result {
    WIN,
    LOSE,
    DRAW;

    @Override
    public String toString() {
        return switch (this) {
            case WIN -> "Gewonnen";
            case LOSE -> "Verloren";
            case DRAW -> "Unentschieden";
        };
    }
}
