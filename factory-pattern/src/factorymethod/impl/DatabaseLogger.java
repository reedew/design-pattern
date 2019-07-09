package factorymethod.impl;

import factorymethod.itfc.Logger;

/**
 * 数据库日志记录器
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
