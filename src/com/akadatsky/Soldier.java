package com.akadatsky;

public final class Soldier extends MovableUnit {

    public Soldier(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("This is Soldier");
    }

    public void pipi() {
        System.out.println("pipi");
    }

}
