package flyweight.ext;

import flyweight.abs.IgoChessman;

/**
 * 白色棋子类
 */
public class WhiteIgoChessman extends IgoChessman {
    @Override
    public String getColor() {
        return "白色";
    }
}
