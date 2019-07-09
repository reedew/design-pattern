package client;

import factory.IgoChessmanFactory;
import flyweight.Coordinates;
import flyweight.abs.IgoChessman;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        IgoChessman black1;
        IgoChessman black2;
        IgoChessman black3;
        IgoChessman white1;
        IgoChessman white2;
        IgoChessmanFactory factory;
        factory = IgoChessmanFactory.getInstance();
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        black3 = factory.getIgoChessman("b");
        System.out.println("判断两颗黑子是否相同：" + (black1 == black2));
        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println("判断两颗白子是否相同：" + (white1 == white2));
        black1.display(new Coordinates(1, 2));
        black2.display(new Coordinates(3, 4));
        black3.display(new Coordinates(1, 3));
        white1.display(new Coordinates(2, 5));
        white2.display(new Coordinates(2, 4));
    }
}
