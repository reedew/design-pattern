package factory.impl;

import abs.Image;
import ext.BMGImage;
import factory.itfc.ImageFactory;

/**
 * BMG图像工厂类
 */
public class BMGImageFactory implements ImageFactory {
    @Override
    public Image getImage() {
        Image image = new BMGImage();
        return image;
    }
}
