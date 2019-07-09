package ctxt;

import abs.ScreenState;
import conc.LargerScreen;
import conc.LargestScreen;
import conc.NormalScreen;

/**
 * 屏幕类
 */
public class Screen {
    // 枚举所有的状态，currentScreen表示当前状态
    private ScreenState currentScreen, normalScreen, largerScreen, largestScreen;

    public Screen() {
        this.normalScreen = new NormalScreen(); // 创建正常状态对象
        this.largerScreen = new LargerScreen(); // 创建二倍放大状态对象
        this.largestScreen = new LargestScreen(); // 创建四倍放大状态对象
        this.currentScreen = normalScreen; // 设置初始状态
        this.currentScreen.display();
    }

    public void setState(ScreenState state) {
        this.currentScreen = state;
    }

    // 单击事件处理方法，封转了对状态类中业务方法的调用和状态的转换
    public void onClick() {
        if (this.currentScreen == normalScreen) {
            this.setState(largerScreen);
            this.currentScreen.display();
        } else if (this.currentScreen == largerScreen) {
            this.setState(largestScreen);
            this.currentScreen.display();
        } else if (this.currentScreen == largestScreen) {
            this.setState(normalScreen);
            this.currentScreen.display();
        }
    }
}
