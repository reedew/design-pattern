package factorymethod.factory.impl;

import factorymethod.factory.itfc.LoggerFactory;
import factorymethod.impl.DatabaseLogger;
import factorymethod.itfc.Logger;

/**
 * 数据库日志记录器工厂类
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        // 连接数据库，代码略
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
