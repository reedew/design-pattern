package abs;

/**
 * 抽象组件类
 */
public abstract class Component {
    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // 转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
