package client;

import abs.AllyControlCenter;
import conc.ConcreteAllyControlCenter;
import conc.Player;
import itfc.Observer;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        // 定义观察目标对象
        AllyControlCenter acc;
        // 定义观察者对象
        Observer player1;
        Observer player2;
        Observer player3;
        Observer player4;
        acc = new ConcreteAllyControlCenter("金庸群侠");
        player1 = new Player("杨过");
        player2 = new Player("张无忌");
        player3 = new Player("令狐冲");
        player4 = new Player("段誉");
        acc.join(player1);
        acc.join(player2);
        acc.join(player3);
        acc.join(player4);
        // 某成员遭受攻击
        player4.beAttacked(acc);
    }
}
