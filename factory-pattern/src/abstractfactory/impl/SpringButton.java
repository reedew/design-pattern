package abstractfactory.impl;

import abstractfactory.itfc.Button;

/**
 * Spring按钮类
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮");
    }
}
