package client;

import abs.Component;
import ext.BlackBorderDecorator;
import ext.ScrollBarDecorator;
import ext.Window;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        Component component;
        Component componentSB;
        Component componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentSB.display();
        System.out.println("------------------");
        componentBB = new BlackBorderDecorator(componentSB);
        componentBB.display();
    }
}
