package func;

import java.util.ArrayList;

/**
 * 功能键设置窗口类
 */
public class FBSettingWindow {
    private String title;// 窗口标题
    ArrayList<FunctionButton> functionButtons = new ArrayList<>();// 存储所有功能键

    public FBSettingWindow(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton button) {
        functionButtons.add(button);
    }

    public void removeFunctionButton(FunctionButton button) {
        functionButtons.remove(button);
    }

    // 显示窗口及功能
    public void display() {
        System.out.println("显示窗口：" + this.title);
        System.out.println("显示功能键：");
        for (FunctionButton button : functionButtons) {
            System.out.println(button.getName());
        }
        System.out.println("---------------------------");
    }
}
