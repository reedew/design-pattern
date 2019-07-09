package factory;

import adapter.obj.OperationAdapter;
import target.ScoreOperation;

/**
 * 操作工厂类
 */
public class OperationFactory {
    private static final ScoreOperation scoreOperation = new OperationAdapter();

    private OperationFactory() {
    }

    public static ScoreOperation getBean() {
        return scoreOperation;
    }
}
