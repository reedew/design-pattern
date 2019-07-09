package cmd.conc;

import cmd.ConfigCommand;

/**
 * 增加命令类
 */
public class InsertCommand extends ConfigCommand {
    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        configOperator.insert(this.args);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.insert(args);
    }
}
