package com.calebli.tutorial;

public class Giraffe {

    private String name;
    private int leavesEaten;
    private boolean thirsty;

    public Giraffe() {
        this("", 0, false);
    }
    public Giraffe(String name, int leavesEaten, boolean thirsty) {
        this.name = name;
        this.leavesEaten = leavesEaten;
        this.thirsty = thirsty;
    }

    public String getName() {
        return name;
    }

    public int getLeavesEaten() {
        return leavesEaten;
    }

    public boolean isThirsty() {
        return thirsty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setThirsty(boolean thirsty) {
        this.thirsty = thirsty;
    }

    public void eatLeaves(int numLeaves) {
        leavesEaten += numLeaves;
        for (int i = 0; i < numLeaves; i++) {
            System.out.println("Eating a leaf");
        }
    }

    public void move(int distance) {
        for (int i = 0; i < distance; i++) {
            System.out.println("Moving");
        }
    }

}
