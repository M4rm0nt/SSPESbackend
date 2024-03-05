package com.marmont.game.model;

import java.util.Random;

public enum Choice {
    STEIN,
    PAPIER,
    SCHERE,
    ECHSE,
    SPOCK;

    public static Choice randomChoice() {
        Choice[] choices = values();
        return choices[new Random().nextInt(choices.length)];
    }

    public Result compareChoices(Choice otherChoice) {
        if (this == otherChoice) {
            return Result.DRAW;
        }

        return switch (this) {
            case STEIN -> (otherChoice == SCHERE || otherChoice == ECHSE) ? Result.WIN : Result.LOSE;
            case PAPIER -> (otherChoice == STEIN || otherChoice == SPOCK) ? Result.WIN : Result.LOSE;
            case SCHERE -> (otherChoice == PAPIER || otherChoice == ECHSE) ? Result.WIN : Result.LOSE;
            case ECHSE -> (otherChoice == SPOCK || otherChoice == PAPIER) ? Result.WIN : Result.LOSE;
            case SPOCK -> (otherChoice == SCHERE || otherChoice == STEIN) ? Result.WIN : Result.LOSE;
        };
    }
}
