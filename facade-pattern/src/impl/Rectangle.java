package impl;

import itfc.Shape;

/**
 * 矩形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
