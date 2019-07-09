package abs;

/**
 * 抽象文件类（透明模式）
 *
 * 安全模式：抽象类只有killVirus()方法，文件夹继承类中添加其他方法
 */
public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
