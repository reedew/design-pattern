package server;

import server.builder.abs.ActorBuilder;
import server.pojo.Actor;

/**
 * 角色创建控制器
 */
public class ActorController {
    // 逐步构建复杂产品对象
    public Actor construct(ActorBuilder actorBuilder) {
        Actor actor = null;
        actorBuilder.buidType();
        actorBuilder.buidSex();
        actorBuilder.buidFace();
        actorBuilder.buidCostume();
        // 通过钩子方法来控制产品的构建
        if (!actorBuilder.isBareheaded()) {
            actorBuilder.buidHairstyle();
        }
        actor = actorBuilder.createActor();
        return actor;
    }
}
