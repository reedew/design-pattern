package cmd.send;

import cmd.ConfigCommand;
import util.FileUtil;

import java.util.ArrayList;

/**
 * 配置文件设置窗口类
 */
public class ConfigSettingWindow {
    private ArrayList<ConfigCommand> configCommands = new ArrayList<>();
    private ConfigCommand configCommand;

    public void setConfigCommand(ConfigCommand configCommand) {
        this.configCommand = configCommand;
    }

    // 执行配置文件修改命令，同时将命令对象添加到命令集合中
    public void call(String args) {
        configCommand.execute(args);
        configCommands.add(configCommand);
    }

    // 记录请求日志，生成日志文件，将命令集合写入日志文件
    public void save() {
        FileUtil.writeCommands(configCommands);
    }

    // 从日志文件中提取命令集合，并循环调用每一个命令对象的execute()方法来实现配置文件的重新设置
    public void recover() {
        ArrayList list;
        list = FileUtil.readCommands();
        for (Object obj : list) {
            ((ConfigCommand) obj).execute();
        }
    }
}
