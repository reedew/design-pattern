package adapter.obj;

import adaptee.BinarySearch;
import adaptee.QuickSort;
import target.ScoreOperation;

/**
 * 分数操作的对象适配器
 */
public class OperationAdapter implements ScoreOperation {
    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter() {
        sortObj = new QuickSort();
        searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
