package conc;

import abs.Component;

/**
 * 组合框类
 */
public class ComboBox extends Component {
    @Override
    public void update() {
        System.out.println("组合框增加一项：令狐冲。");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }
}
