package ext;

import abs.Image;
import assist.Matrix;

/**
 * BMG格式图像
 */
public class BMGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + "，格式为BMG。");
    }
}
