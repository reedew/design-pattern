package client;

import abs.Component;
import abs.Mediator;
import conc.*;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        // 定义中介者对象
        Mediator mediator = new ConcreteMediator();
        // 定义同事对象
        Component addBT = new Button();
        Component list = new List();
        Component cb = new ComboBox();
        Component userNameTB = new TextBox();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);

        ((ConcreteMediator) mediator).addButton = (Button) addBT;
        ((ConcreteMediator) mediator).list = (List) list;
        ((ConcreteMediator) mediator).cb = (ComboBox) cb;
        ((ConcreteMediator) mediator).userNameTextBox = (TextBox) userNameTB;

        addBT.changed();
        System.out.println("-----------------------------");
        list.changed();
        System.out.println("-----------------------------");
        cb.changed();
        System.out.println("-----------------------------");
        userNameTB.changed();
    }
}
