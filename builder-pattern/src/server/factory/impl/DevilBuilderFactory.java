package server.factory.impl;

import server.builder.abs.ActorBuilder;
import server.builder.ext.DevilBuilder;
import server.factory.itfc.ActorBuilderFactory;

/**
 * 恶魔建造器工厂类
 */
public class DevilBuilderFactory implements ActorBuilderFactory {
    @Override
    public ActorBuilder createActorBuilder() {
        ActorBuilder actorBuilder = new DevilBuilder();
        return actorBuilder;
    }
}
