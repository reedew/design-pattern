package prime.client;

import prime.server.LoadBalancer;

/**
 * 客户端测试
 * <p>
 * 存在问题：在多线程环境中，第一次getInstance()未完成时，紧接着有新的对象获取实例，条件为null仍然成立，所以导致产生了多个实例。
 */
public class Client {
    public static void main(String[] args) {
        // 创建四个LoadBalancer对象
        LoadBalancer balancer1 = null;
        LoadBalancer balancer2 = null;
        LoadBalancer balancer3 = null;
        LoadBalancer balancer4 = null;
        balancer1 = LoadBalancer.getInstance();
        balancer2 = LoadBalancer.getInstance();
        balancer3 = LoadBalancer.getInstance();
        balancer4 = LoadBalancer.getInstance();
        // 判断负载均衡器是否相同
        if (balancer1 == balancer2 && balancer2 == balancer3 && balancer3 == balancer4) {
            System.out.println("负载均衡器具有唯一性");
        }
        // 增加服务器
        balancer1.addServer("server1");
        balancer1.addServer("server2");
        balancer1.addServer("server3");
        balancer1.addServer("server4");
        // 模拟客户端请求的分发
        for (int i = 0; i < 10; i++) {
            String server = balancer1.getServer();
            System.out.println("分发请求至服务器：" + server);
        }
    }
}
