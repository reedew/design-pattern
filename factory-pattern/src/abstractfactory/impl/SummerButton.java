package abstractfactory.impl;

import abstractfactory.itfc.Button;

/**
 * Summer按钮类
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮");
    }
}
