package lazy;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用双重检查锁定实现懒汉式
 * <p>
 * 存在问题：volatile会屏蔽JVM所做的一些优化，可能导致系统运行效率降低。
 */
public class LazySingleton {
    // 被volatile修饰的成员变量可以确保多个线程都能够正确处理
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        // 第一重判断
        if (instance == null) {
            // 锁定代码块(不对方法锁定是为了提高系统性能)
            synchronized (LazySingleton.class) {
                // 第二重判断(线程B不知道线程A已经创建了实例)
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
