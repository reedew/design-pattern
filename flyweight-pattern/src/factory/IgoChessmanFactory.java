package factory;

import flyweight.abs.IgoChessman;
import flyweight.ext.BlackIgoChessman;
import flyweight.ext.WhiteIgoChessman;

import java.util.Hashtable;

/**
 * 围棋棋子工厂类
 */
public class IgoChessmanFactory {
    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht;// 充当亨元池

    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black;
        IgoChessman white;
        black = new BlackIgoChessman();
        ht.put("b", black);
        white = new WhiteIgoChessman();
        ht.put("w", white);
    }

    public static IgoChessmanFactory getInstance() {
        return instance;
    }

    // 通过key来获取Hashtable中的亨元对象
    public static IgoChessman getIgoChessman(String color) {
        return (IgoChessman) ht.get(color);
    }
}
