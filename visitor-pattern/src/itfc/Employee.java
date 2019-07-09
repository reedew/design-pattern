package itfc;

import abs.Department;

/**
 * 员工接口
 */
public interface Employee {
    public void accept(Department handler); // 接受一个抽象访问者访问
}
