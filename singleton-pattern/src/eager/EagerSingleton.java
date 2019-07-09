package eager;

/**
 * 饿汉式单例
 * <p>
 * 在类加载的时候就创建了单例
 */
public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
