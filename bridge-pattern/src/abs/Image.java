package abs;

import itfc.ImageImp;

/**
 * 抽象图像类
 */
public abstract class Image {
    // 定义实现类接口对象
    protected ImageImp imp;

    public void setImp(ImageImp imp) {
        this.imp = imp;
    }

    // 声明抽象业务方法
    public abstract void parseFile(String fileName);
}
