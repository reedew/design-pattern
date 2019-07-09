package jo.client;

import jo.impl.ConcretePrototype;
import jo.itfc.JOPrototype;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        JOPrototype obj1 = new ConcretePrototype();
        JOPrototype obj2 = ((ConcretePrototype) obj1).clone();
        System.out.println("==：" + (obj1 == obj2));
        System.out.println("equals：" + obj1.equals(obj2));
    }
}
