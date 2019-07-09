package conc;

import abs.AllyControlCenter;
import itfc.Observer;

/**
 * 具体战队控制中心类
 */
public class ConcreteAllyControlCenter extends AllyControlCenter {
    public ConcreteAllyControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("-------------");
        this.allyName = allyName;
    }

    @Override
    public void notifyObserver(String name) {
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "正在遭受攻击！");
        // 遍历观察者集合，调用每一个盟友（自己除外）的支援方法
        for (Observer ob : players) {
            if (!ob.getName().equalsIgnoreCase(name)) {
                ob.help();
            }
        }
    }
}
