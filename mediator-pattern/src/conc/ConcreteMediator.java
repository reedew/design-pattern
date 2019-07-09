package conc;

import abs.Component;
import abs.Mediator;

/**
 * 具体中介者
 */
public class ConcreteMediator extends Mediator {
    // 维持对各个同事对象的引用
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

    // 封装同事对象之间的交互
    @Override
    public void componentChanged(Component c) {
        if (c == addButton) {
            System.out.println("--点击增加按钮--");
            list.update();
            userNameTextBox.update();
            cb.update();
        } else if (c == list) {
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        } else if (c == cb) {
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}
