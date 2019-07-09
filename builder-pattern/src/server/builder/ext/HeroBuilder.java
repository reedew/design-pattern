package server.builder.ext;

import server.builder.abs.ActorBuilder;

/**
 * 英雄角色建造器
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buidType() {
        actor.setType("英雄");
    }

    @Override
    public void buidSex() {
        actor.setSex("男");
    }

    @Override
    public void buidFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buidCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buidHairstyle() {
        actor.setHairstyle("飘逸");
    }
}
