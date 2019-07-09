package conc;

import abs.Component;

/**
 * 列表框类
 */
public class List extends Component {
    @Override
    public void update() {
        System.out.println("列表框增加一项：令狐冲。");
    }

    public void select() {
        System.out.println("列表框选中项：小龙女。");
    }
}
