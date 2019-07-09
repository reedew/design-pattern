package cmd.conc;

import cmd.ConfigCommand;

/**
 * 删除命令类
 */
public class DeleteCommand extends ConfigCommand {
    public DeleteCommand(String name) {
        super(name);
    }

    @Override
    public void execute() {
        configOperator.delete(this.args);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.delete(args);
    }
}
