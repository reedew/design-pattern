package factory.impl;

import abs.Image;
import ext.GIFImage;
import factory.itfc.ImageFactory;

/**
 * GIF图像工厂类
 */
public class GIFImageFactory implements ImageFactory {
    @Override
    public Image getImage() {
        Image image = new GIFImage();
        return image;
    }
}
