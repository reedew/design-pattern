package client;

import server.ActorController;
import server.builder.abs.ActorBuilder;
import server.factory.impl.AngleBuilderFactory;
import server.factory.itfc.ActorBuilderFactory;
import server.pojo.Actor;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        // 声明对象
        ActorBuilder actorBuilder = null;
        ActorBuilderFactory factory = null;
        ActorController controller = null;
        Actor actor = null;
        // 指定实例
        factory = new AngleBuilderFactory();
        actorBuilder = factory.createActorBuilder();
        controller = new ActorController();
        actor = controller.construct(actorBuilder);
        // 输出结果
        System.out.println(actor.getType() + "的外观：");
        System.out.println("性别：" + actor.getSex());
        System.out.println("面容：" + actor.getFace());
        System.out.println("服装：" + actor.getCostume());
        System.out.println("发型：" + actor.getHairstyle());
    }
}
