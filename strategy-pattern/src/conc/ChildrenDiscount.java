package conc;

import itfc.Discount;

/**
 * 儿童票折扣类
 */
public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }
}
