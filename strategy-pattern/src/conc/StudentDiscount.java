package conc;

import itfc.Discount;

/**
 * 学生票折扣类
 */
public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;
    }
}
