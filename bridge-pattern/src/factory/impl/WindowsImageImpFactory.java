package factory.impl;

import factory.itfc.ImageImpFactory;
import imp.WindowsImp;
import itfc.ImageImp;

/**
 * Windows图像展示
 */
public class WindowsImageImpFactory implements ImageImpFactory {
    @Override
    public ImageImp getImageImp() {
        ImageImp imp = new WindowsImp();
        return imp;
    }
}
