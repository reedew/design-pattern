package abstractfactory.factory.abst;

import abstractfactory.itfc.Button;
import abstractfactory.itfc.ComboBox;
import abstractfactory.itfc.TextField;

/**
 * 皮肤抽象工厂
 */
public abstract class SkinFactory {
    public abstract Button createButton();

    public abstract ComboBox createComboBox();

    public abstract TextField createTextField();
}
