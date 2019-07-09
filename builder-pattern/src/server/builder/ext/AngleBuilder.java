package server.builder.ext;

import server.builder.abs.ActorBuilder;

/**
 * 天使角色建造器
 */
public class AngleBuilder extends ActorBuilder {
    @Override
    public void buidType() {
        actor.setType("天使");
    }

    @Override
    public void buidSex() {
        actor.setSex("女");
    }

    @Override
    public void buidFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buidCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void buidHairstyle() {
        actor.setHairstyle("披肩长发");
    }
}
