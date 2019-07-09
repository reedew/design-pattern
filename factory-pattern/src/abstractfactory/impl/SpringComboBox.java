package abstractfactory.impl;

import abstractfactory.itfc.ComboBox;

/**
 * Spring组合框类
 */
public class SpringComboBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示绿色边框组合框");
    }
}
