package abs;

/**
 * 抽象游戏类
 */
public abstract class Game {
    public abstract void initialize();// 初始化游戏

    public abstract void startPlay();// 开始游戏

    public abstract void endPlay();// 结束游戏

    // 模板
    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
