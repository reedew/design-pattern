package client;

import factory.OperationFactory;
import target.ScoreOperation;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        ScoreOperation scoreOperation = null;// 声明接口
        scoreOperation = OperationFactory.getBean();// 获取实例
        int[] scores = {84, 76, 50, 69, 90, 91, 88, 96};// 定义成绩数组
        int[] result = null;// 定义结果数组
        int score = 0;// 定义要查询的成绩
        result = scoreOperation.sort(scores);// 排序
        // 遍历
        for (int i : result) {
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("查询成绩93：");
        score = scoreOperation.search(result, 93);
        if (score != -1) {
            System.out.println("已找到");
        } else {
            System.out.println("没有找到");
        }
    }
}
