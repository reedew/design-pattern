package factorymethod.factory.itfc;

import factorymethod.itfc.Logger;

/**
 * 日志记录器工厂接口
 */
public interface LoggerFactory {
    public Logger createLogger();
}
