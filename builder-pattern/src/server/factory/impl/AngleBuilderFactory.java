package server.factory.impl;

import server.builder.abs.ActorBuilder;
import server.builder.ext.AngleBuilder;
import server.factory.itfc.ActorBuilderFactory;

/**
 * 天使建造器工厂类
 */
public class AngleBuilderFactory implements ActorBuilderFactory {
    @Override
    public ActorBuilder createActorBuilder() {
        ActorBuilder actorBuilder = new AngleBuilder();
        return actorBuilder;
    }
}
