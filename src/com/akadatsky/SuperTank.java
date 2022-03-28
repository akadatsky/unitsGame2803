package com.akadatsky;

public class SuperTank extends Tank {

    public SuperTank(int x, int y) {
        super(x, y);
    }

// 'reload()' cannot override 'reload()' in 'com.akadatsky.Tank'; overridden method is final
//    @Override
//    public void reload() {
//        System.out.println("One more reload");
//    }

}
