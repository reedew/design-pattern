package factorymethod.client;

import factorymethod.factory.impl.FileLoggerFactory;
import factorymethod.factory.itfc.LoggerFactory;
import factorymethod.itfc.Logger;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
