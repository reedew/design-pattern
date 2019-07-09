package cmd.conc;

import cmd.AbstractCommand;
import recv.Adder;

import java.util.ArrayList;

/**
 * 具体命令类
 */
public class ConcreteCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private int value = 0;
    private int last = 0;
    // 存储每次计算的操作数
    private ArrayList<Integer> undoList = new ArrayList<>();
    private ArrayList<Integer> redoList = new ArrayList<>();

    @Override
    public int execute(int value) {
        this.value = value;
        int i = adder.add(value);
        last = i;
        undoList.add(value);
        return i;
    }

    @Override
    public int undo() {
        if (undoList.size() >= 1) {
            int i = adder.add(-undoList.get(undoList.size() - 1));
            redoList.add(undoList.get(undoList.size() - 1));
            undoList.remove(undoList.get(undoList.size() - 1));
            return i;
        }
        return 0;
    }

    @Override
    public int redo() {
        if (redoList.size() >= 1) {
            int i = adder.add(redoList.get(redoList.size() - 1));
            redoList.remove(redoList.get(redoList.size() - 1));
            return i;
        }
        return last;
    }
}
