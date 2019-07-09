package recv;

/**
 * 加法类
 */
public class Adder {
    private int num = 0;// 定义初始值

    public int add(int value) {
        num += value;
        return num;
    }
}
