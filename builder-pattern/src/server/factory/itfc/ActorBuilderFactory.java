package server.factory.itfc;

import server.builder.abs.ActorBuilder;

/**
 * 角色建造器工厂接口
 */
public interface ActorBuilderFactory {
    public ActorBuilder createActorBuilder();
}
