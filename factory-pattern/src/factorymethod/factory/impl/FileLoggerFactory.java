package factorymethod.factory.impl;

import factorymethod.factory.itfc.LoggerFactory;
import factorymethod.impl.FileLogger;
import factorymethod.itfc.Logger;

/**
 * 文件日志记录器工厂类
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
