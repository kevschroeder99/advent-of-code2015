package day01;

public class Building {

    public int floorLevel;

    // Starts on Floor 0
    public Building() {
        this.floorLevel = 0;
    }

    public void goUpOneFloor() {
        this.floorLevel++;
    }

    public void goDownOneFloor() {
        this.floorLevel--;
    }

}
