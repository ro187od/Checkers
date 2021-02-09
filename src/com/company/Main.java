package com.company;

import com.company.desk.Desk;
import com.company.pawn.Pawn;
import com.company.pawn.PositionPawn;

public class Main {

    public static void main(String[] args) {
	    Desk desk = Desk.getInstance();
        PositionPawn positionPawn_1 = new PositionPawn("B3");
        Pawn pawn = new Pawn(desk, positionPawn_1);
        pawn.toTakeAPositionOnTheDesk();
        desk.print();
        PositionPawn positionPawn_2 = new PositionPawn("C2");
        pawn.toWalk(positionPawn_2);
        desk.print();
    }
}
