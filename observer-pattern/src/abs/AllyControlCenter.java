package abs;

import itfc.Observer;

import java.util.ArrayList;

/**
 * 战队控制中心
 */
public abstract class AllyControlCenter {
    protected String allyName;// 战队名
    protected ArrayList<Observer> players = new ArrayList<>();

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public void join(Observer ob) {
        System.out.println(ob.getName() + "加入" + this.allyName + "战队！");
        players.add(ob);
    }

    public void quit(Observer ob) {
        System.out.println(ob.getName() + "退出" + this.allyName + "战队！");
        players.remove(ob);
    }

    // 声明抽象通知方法
    public abstract void notifyObserver(String name);
}
