package func;

import cmd.Command;

/**
 * 功能键类
 */
public class FunctionButton {
    private String name;// 功能键名称
    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    // 发送请求的方法
    public void onClick() {
        System.out.println("点击功能键" + command + "：");
        command.execute();
    }
}
