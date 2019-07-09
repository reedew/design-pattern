package client;

import abs.AbstractFile;
import ext.Folder;
import ext.ImageFile;
import ext.TextFile;
import ext.VideoFile;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        AbstractFile folder1;
        AbstractFile folder2;
        AbstractFile folder3;
        AbstractFile folder4;
        AbstractFile file1;
        AbstractFile file2;
        AbstractFile file3;
        AbstractFile file4;
        AbstractFile file5;
        folder1 = new Folder("Sunny的资料");
        folder2 = new Folder("图像文件");
        folder3 = new Folder("文本文件");
        folder4 = new Folder("视频文件");
        file1 = new ImageFile("小龙女.jpg");
        file2 = new ImageFile("张无忌.gif");
        file3 = new TextFile("九阴真经.txt");
        file4 = new TextFile("葵花宝典.doc");
        file5 = new VideoFile("笑傲江湖.rmvb");
        // 图像文件夹
        folder2.add(file1);
        folder2.add(file2);
        // 文本文件夹
        folder3.add(file3);
        folder3.add(file4);
        // 视频文件夹
        folder4.add(file5);
        // 总文件夹
        folder1.add(folder2);
        folder1.add(folder3);
        folder1.add(folder4);
        // 开始杀毒操作
        folder1.killVirus();
    }
}
