package cmd.conc;

import cmd.Command;
import recv.WindowHandler;

/**
 * 最小化命令类
 */
public class MinimizeCommand extends Command {
    private WindowHandler windowHandler;

    public MinimizeCommand() {
        windowHandler = new WindowHandler();
    }

    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
