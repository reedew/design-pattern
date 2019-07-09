package server.builder.ext;

import server.builder.abs.ActorBuilder;

/**
 * 恶魔角色建造器
 */
public class DevilBuilder extends ActorBuilder {
    @Override
    public void buidType() {
        actor.setType("恶魔");
    }

    @Override
    public void buidSex() {
        actor.setSex("妖");
    }

    @Override
    public void buidFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buidCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buidHairstyle() {
        actor.setHairstyle("光头");
    }

    // 覆盖钩子方法
    @Override
    public boolean isBareheaded() {
        return true;
    }
}
