package client;

import cmd.AbstractCommand;
import cmd.conc.ConcreteCommand;
import cmd.send.CalculatorForm;

/**
 * 客户端测试：只能完成连续的撤销或者恢复，不能实现撤销中间穿插恢复的情景
 */
public class CalcClient {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new ConcreteCommand();
        form.setCommand(command);
        form.compute(10);
        form.compute(20);
        form.compute(30);
        form.undo();
        form.undo();
        form.redo();
        form.undo();
        form.undo();
        form.redo();
        form.redo();
        form.redo();
        form.redo();
    }
}
