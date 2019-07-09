package client;

import cmd.ConfigCommand;
import cmd.conc.DeleteCommand;
import cmd.conc.InsertCommand;
import cmd.conc.ModifyCommand;
import cmd.send.ConfigSettingWindow;
import recv.ConfigOperator;

/**
 * 客户端测试
 */
public class ConfClient {
    public static void main(String[] args) {
        ConfigSettingWindow window = new ConfigSettingWindow();
        ConfigCommand command;
        ConfigOperator configOperator = new ConfigOperator();
        // 更改配置文件
        command = new InsertCommand("增加");
        command.setConfigOperator(configOperator);
        window.setConfigCommand(command);
        window.call("网站首页");
        command = new ModifyCommand("修改");
        command.setConfigOperator(configOperator);
        window.setConfigCommand(command);
        window.call("网站首页");
        command = new DeleteCommand("删除");
        command.setConfigOperator(configOperator);
        window.setConfigCommand(command);
        window.call("网站首页");
        System.out.println("----------------------------");
        System.out.println("保存配置");
        window.save();
        System.out.println("----------------------------");
        System.out.println("恢复配置");
        System.out.println("----------------------------");
        window.recover();
    }
}
