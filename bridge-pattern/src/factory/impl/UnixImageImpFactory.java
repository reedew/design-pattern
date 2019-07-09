package factory.impl;

import factory.itfc.ImageImpFactory;
import imp.UnixImp;
import itfc.ImageImp;

/**
 * Unix图像展示
 */
public class UnixImageImpFactory implements ImageImpFactory {
    @Override
    public ImageImp getImageImp() {
        ImageImp imp = new UnixImp();
        return imp;
    }
}
