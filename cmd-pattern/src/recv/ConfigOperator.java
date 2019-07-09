package recv;

import java.io.Serializable;

/**
 * 配置文件操作类
 */
public class ConfigOperator implements Serializable {
    public void insert(String args) {
        System.out.println("新增节点：" + args);
    }

    public void modify(String args) {
        System.out.println("修改节点：" + args);
    }

    public void delete(String args) {
        System.out.println("删除节点：" + args);
    }
}
