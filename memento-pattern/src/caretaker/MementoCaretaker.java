package caretaker;

import memento.ChessmanMemento;

import java.util.ArrayList;

/**
 * 象棋棋子备忘录管理类
 */
public class MementoCaretaker {
    // 定义一个集合来存储多个备忘录
    private ArrayList mementolist = new ArrayList();
    private ChessmanMemento memento;

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementolist.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}
