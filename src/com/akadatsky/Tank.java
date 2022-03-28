package com.akadatsky;

public class Tank extends MovableUnit {

    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw() {
        System.out.println("This is Tank");
    }

    public final void reload() {
        System.out.println("reload");
    }

}
