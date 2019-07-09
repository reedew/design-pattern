package itfc;

import abs.AllyControlCenter;

/**
 * 抽象观察类
 */
public interface Observer {
    public String getName();

    public void setName(String name);

    /** 声明支援盟友方法 */
    public void help();

    /** 声明遭受攻击方法 */
    public void beAttacked(AllyControlCenter acc);
}
