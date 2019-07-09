package abstractfactory.factory.exte;

import abstractfactory.factory.abst.SkinFactory;
import abstractfactory.impl.SummerButton;
import abstractfactory.impl.SummerComboBox;
import abstractfactory.impl.SummerTextField;
import abstractfactory.itfc.Button;
import abstractfactory.itfc.ComboBox;
import abstractfactory.itfc.TextField;

/**
 * Summer皮肤工厂
 */
public class SummerSkinFactory extends SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }
}
