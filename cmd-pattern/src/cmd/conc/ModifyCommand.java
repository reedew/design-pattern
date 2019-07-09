package cmd.conc;

import cmd.ConfigCommand;

/**
 * 修改命令类
 */
public class ModifyCommand extends ConfigCommand {
    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        configOperator.modify(this.args);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }
}
