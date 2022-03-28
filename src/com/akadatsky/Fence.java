package com.akadatsky;

public class Fence extends Unit {

    public Fence(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("This is Fence");
    }

}
