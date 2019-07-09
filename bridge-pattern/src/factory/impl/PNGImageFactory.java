package factory.impl;

import abs.Image;
import ext.PNGImage;
import factory.itfc.ImageFactory;

/**
 * PNG图像工厂类
 */
public class PNGImageFactory implements ImageFactory {
    @Override
    public Image getImage() {
        Image image = new PNGImage();
        return image;
    }
}
