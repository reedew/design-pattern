package abstractfactory.impl;

import abstractfactory.itfc.ComboBox;

/**
 * Summer组合框类
 */
public class SummerComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框");
    }
}
