package com.carlosguemes.lambdas;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

interface Drawable {
    void draw();
}
class DrawableImpl implements Drawable {

    @Override
    public void draw() {
        System.out.println("drawing ...");
    }
}
public class LambdaExample1 {

    public static void main(String[] args) {
//        Drawable drawable = new DrawableImpl();
//        drawable.draw();

        Drawable drawable1 = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing ...");
            }
        };
        drawable1.draw();

        Drawable drawable = ()-> System.out.println("Drawing ...");

        drawable.draw();
    }
}
