package cmd.send;

import cmd.AbstractCommand;

/**
 * 计算器界面类
 */
public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    // 调用命令对象的execute()执行运算
    public void compute(int value) {
        int i = command.execute(value);
        System.out.println("执行运算，计算结果为：" + i);
    }

    // 调用命令对象的undo()撤销运算
    public void undo() {
        int i = command.undo();
        System.out.println("执行撤销，计算结果为：" + i);
    }

    // 调用命令对象的redo()恢复操作
    public void redo() {
        int i = command.redo();
        System.out.println("执行恢复，计算结果为：" + i);
    }
}
