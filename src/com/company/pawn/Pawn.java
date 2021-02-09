package com.company.pawn;

import com.company.desk.Desk;
import com.company.pawn.PositionPawn;

public class Pawn {
    private Desk desk;
    private PositionPawn positionPawn;

    public Pawn(Desk desk, PositionPawn positionPawn) {
        this.desk = desk;
        this.positionPawn = positionPawn;
    }

    public void toTakeAPositionOnTheDesk(){
        desk.toTakeAPosition(positionPawn);
    }
}
