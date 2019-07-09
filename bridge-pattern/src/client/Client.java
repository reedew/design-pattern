package client;

import abs.Image;
import factory.impl.JPGImageFactory;
import factory.impl.WindowsImageImpFactory;
import factory.itfc.ImageFactory;
import factory.itfc.ImageImpFactory;
import itfc.ImageImp;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        ImageFactory factory;
        ImageImpFactory impFactory;
        Image image;
        ImageImp imp;
        factory = new JPGImageFactory();
        image = factory.getImage();
        impFactory = new WindowsImageImpFactory();
        imp = impFactory.getImageImp();
        image.setImp(imp);
        image.parseFile("小龙女");
    }
}
