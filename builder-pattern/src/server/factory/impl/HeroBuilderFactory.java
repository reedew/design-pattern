package server.factory.impl;

import server.builder.abs.ActorBuilder;
import server.builder.ext.HeroBuilder;
import server.factory.itfc.ActorBuilderFactory;

/**
 * 英雄建造器工厂类
 */
public class HeroBuilderFactory implements ActorBuilderFactory {
    @Override
    public ActorBuilder createActorBuilder() {
        ActorBuilder actorBuilder = new HeroBuilder();
        return actorBuilder;
    }
}
