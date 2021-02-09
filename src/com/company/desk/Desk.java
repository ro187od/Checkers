package com.company.desk;

import com.company.pawn.PositionPawn;

public class Desk {
    private char[][] deskTable;
    private static Desk instance;

    private Desk(){
//      задаём размер двухмерного массива(поле доски)
        deskTable = new char[8][8];
//      запускаем цикл до 8(поле доски)
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 != 0){
                    deskTable[i][j] = '+';
                }
                else if (i % 2 != 0 && j % 2 == 0){
                    deskTable[i][j] = '+';
                }
                else {
                    deskTable[i][j] = '-';
                }
            }
        }
    }

    public static Desk getInstance(){
        if(instance == null){
            instance = new Desk();
        }
        return instance;
    }

    public void print(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(deskTable[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void toTakeAPosition(char letterPos, char numberPos) {
        if(deskTable[letterPos][numberPos] == '+'){
            deskTable[letterPos][numberPos] = 'x';
        }
    }
}
