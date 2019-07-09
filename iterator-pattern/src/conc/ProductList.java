package conc;

import abs.AbstractObjectList;
import itfc.AbstractIterator;

import java.util.List;

/**
 * 商品数据类
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}
