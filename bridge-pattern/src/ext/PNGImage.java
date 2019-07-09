package ext;

import abs.Image;
import assist.Matrix;

/**
 * PNG格式图像
 */
public class PNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为PNG。");
    }
}
