package client;

import cmd.Command;
import cmd.conc.HelpCommand;
import cmd.conc.MinimizeCommand;
import func.FBSettingWindow;
import func.FunctionButton;

/**
 * 客户端测试
 */
public class FBClient {
    public static void main(String[] args) {
        FBSettingWindow fbSettingWindow = new FBSettingWindow("功能键设置");
        FunctionButton button1;
        FunctionButton button2;
        button1 = new FunctionButton("功能键1");
        button2 = new FunctionButton("功能键2");
        Command command1;
        Command command2;
        command1 = new HelpCommand();
        command2 = new MinimizeCommand();
        // 将命令对象注入功能键
        button1.setCommand(command1);
        button2.setCommand(command2);
        fbSettingWindow.addFunctionButton(button1);
        fbSettingWindow.addFunctionButton(button2);
        fbSettingWindow.display();
        // 调用功能键的业务方法
        button1.onClick();
        button2.onClick();
    }
}
