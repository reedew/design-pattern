package abstractfactory.factory.exte;

import abstractfactory.factory.abst.SkinFactory;
import abstractfactory.impl.SpringButton;
import abstractfactory.impl.SpringComboBox;
import abstractfactory.impl.SpringTextField;
import abstractfactory.itfc.Button;
import abstractfactory.itfc.ComboBox;
import abstractfactory.itfc.TextField;

/**
 * Spring皮肤工厂
 */
public class SpringSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}
