package factorymethod.impl;

import factorymethod.itfc.Logger;

/**
 * 文件日志记录器
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
