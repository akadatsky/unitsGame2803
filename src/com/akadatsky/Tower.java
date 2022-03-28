package com.akadatsky;

public class Tower extends Unit {

    public Tower(int x, int y) {
        super(x, y);
        immortal = true;
    }

    @Override
    public void draw() {
        System.out.println("This is Tower");
    }

}
