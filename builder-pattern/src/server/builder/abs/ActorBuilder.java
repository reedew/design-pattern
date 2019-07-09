package server.builder.abs;

import server.pojo.Actor;

/**
 * 抽象角色建造者
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buidType();

    public abstract void buidSex();

    public abstract void buidFace();

    public abstract void buidCostume();

    public abstract void buidHairstyle();

    // 钩子方法：判断是否是光头
    public boolean isBareheaded() {
        return false;
    }

    // 工厂方法，返回一个完整的角色对象
    public Actor createActor() {
        return actor;
    }
}
