package cmd;

/**
 * 抽象命令类
 */
public abstract class AbstractCommand {
    public abstract int execute(int value);// 计算方法

    public abstract int undo();// 撤销方法

    public abstract int redo();// 恢复方法
}
