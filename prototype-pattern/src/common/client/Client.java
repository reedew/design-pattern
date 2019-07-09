package common.client;

import common.impl.ConcretePrototype;
import common.itfc.Prototype;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        Prototype prototype1 = new ConcretePrototype();
        ((ConcretePrototype) prototype1).setAttr("Sunny");
        Prototype prototype2 = prototype1.clone();
        System.out.println("==：" + (prototype1 == prototype2));
        System.out.println("equals：" + prototype1.equals(prototype2));
    }
}
