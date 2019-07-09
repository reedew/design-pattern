package factory.impl;

import factory.itfc.ImageImpFactory;
import imp.LinuxImp;
import itfc.ImageImp;

/**
 * Linux图像展示
 */
public class LinuxImageImpFactory implements ImageImpFactory {
    @Override
    public ImageImp getImageImp() {
        ImageImp imp = new LinuxImp();
        return imp;
    }
}
