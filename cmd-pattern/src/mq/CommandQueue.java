package mq;

import cmd.Command;

import java.util.ArrayList;

/**
 * 命令队列
 */
public class CommandQueue {
    private ArrayList<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
