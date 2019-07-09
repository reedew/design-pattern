package abstractfactory.impl;

import abstractfactory.itfc.TextField;

/**
 * Summer文本框类
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框");
    }
}
