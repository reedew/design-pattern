package weeklog.deep.server;

import java.io.Serializable;

/**
 * 可实现序列化的附件类
 * <p>
 * 深克隆可通过序列化来实现，不仅可以复制对象本身，而且可以复制其引用的成员对象
 */
public class Attachment implements Serializable {
    private static final long serialVersionUID = -8953496170385677961L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void download() {
        System.out.println("下载附件：" + name);
    }
}
