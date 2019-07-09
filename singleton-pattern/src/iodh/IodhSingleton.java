package iodh;

/**
 * IoDH: Initialization on Demand Holder
 * <p>
 * IoDH的缺点：很多语言不支持
 * <p>
 * 单例模式的主要缺点：a.没有抽象层，扩展困难；b.违背了单一职责原则；c.共享对象长时间不使用可能会被垃圾回收器回收。
 */
public class IodhSingleton {
    private IodhSingleton() {
    }

    private static class Holder {
        private static final IodhSingleton instance = new IodhSingleton();
    }

    public static IodhSingleton getInstance() {
        return Holder.instance;
    }

    // 测试
    public static void main(String[] args) {
        IodhSingleton singleton1 = null;
        IodhSingleton singleton2 = null;
        singleton1 = IodhSingleton.getInstance();
        singleton2 = IodhSingleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
