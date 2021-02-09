package com.company.pawn;

public class PositionPawn {
    private char letterPos;
    private char numberPos;

    public char getLetterPos() {
        return (char) (letterPos - 'A');
    }

    public void setLetterPos(char letterPos) {
        this.letterPos = letterPos;
    }

    public char getNumberPos() {
        return (char) (numberPos - '1');
    }

    public void setNumberPos(char numberPos) {
        this.numberPos = numberPos;
    }

    public PositionPawn(String position){
        this.letterPos = position.charAt(0);
        this.numberPos = position.charAt(1);
    }
}
