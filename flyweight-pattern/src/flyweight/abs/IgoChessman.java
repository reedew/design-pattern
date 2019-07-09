package flyweight.abs;

import flyweight.Coordinates;

/**
 * 抽象围棋棋子类
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" +
                ("x:" + coordinates.getX() + ",y:" + coordinates.getY()));
    }
}
