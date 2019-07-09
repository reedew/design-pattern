package factory.impl;

import abs.Image;
import ext.JPGImage;
import factory.itfc.ImageFactory;

/**
 * JPG图像工厂类
 */
public class JPGImageFactory implements ImageFactory {
    @Override
    public Image getImage() {
        Image image = new JPGImage();
        return image;
    }
}
