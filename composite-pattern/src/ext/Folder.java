package ext;

import abs.AbstractFile;

import java.util.ArrayList;

/**
 * 文件夹类
 */
public class Folder extends AbstractFile {
    // 定义集合存储AbstractFile类型成员
    private ArrayList<AbstractFile> fileList = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");
        // 递归调用成员构件的killVirus()方法
        for (AbstractFile file : fileList) {
            file.killVirus();
        }
    }
}
