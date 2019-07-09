package target;

/**
 * 成绩操作接口
 */
public interface ScoreOperation {
    public int[] sort(int[] array);// 成绩排序

    public int search(int[] array, int key);// 成绩查找
}
