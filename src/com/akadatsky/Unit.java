package com.akadatsky;

public abstract class Unit {

    protected int x;
    protected int y;
    protected boolean immortal = false;

    public Unit(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isImmortal() {
        return immortal;
    }

    public abstract void draw();

}
