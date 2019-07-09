package abstractfactory.impl;

import abstractfactory.itfc.TextField;

/**
 * Spring文本框类
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色边框文本框");
    }
}
