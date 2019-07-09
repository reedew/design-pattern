package mq;

/**
 * 请求发送者
 */
public class Invoker {
    private CommandQueue commandQueue;

    public Invoker(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void call() {
        commandQueue.execute();
    }
}
