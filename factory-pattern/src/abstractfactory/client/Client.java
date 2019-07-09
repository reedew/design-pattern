package abstractfactory.client;

import abstractfactory.factory.exte.SpringSkinFactory;
import abstractfactory.factory.abst.SkinFactory;
import abstractfactory.itfc.Button;
import abstractfactory.itfc.ComboBox;
import abstractfactory.itfc.TextField;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        SkinFactory factory;
        Button button;
        ComboBox comboBox;
        TextField textField;
        factory = new SpringSkinFactory();
        button = factory.createButton();
        comboBox = factory.createComboBox();
        textField = factory.createTextField();
        button.display();
        comboBox.display();
        textField.display();
    }
}
