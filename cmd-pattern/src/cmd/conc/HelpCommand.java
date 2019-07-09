package cmd.conc;

import cmd.Command;
import recv.HelpHandler;

/**
 * 帮助命令类
 */
public class HelpCommand extends Command {
    private HelpHandler helpHandler;

    public HelpCommand() {
        helpHandler = new HelpHandler();
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}
