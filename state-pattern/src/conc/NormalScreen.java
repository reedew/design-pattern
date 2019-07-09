package conc;

import abs.ScreenState;

/**
 * 正常屏幕类
 */
public class NormalScreen extends ScreenState {
    @Override
    public void display() {
        System.out.println("正常大小");
    }
}
