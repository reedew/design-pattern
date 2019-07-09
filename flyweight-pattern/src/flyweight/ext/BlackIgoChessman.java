package flyweight.ext;

import flyweight.abs.IgoChessman;

/**
 * 黑色棋子类
 */
public class BlackIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "黑色";
    }
}
