package apr;

import req.PurchaseRequest;

/**
 * 审批者类
 */
public abstract class Approver {
    protected String name;// 审批者姓名
    protected Approver successor;// 定义后继者

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    // 抽象请求处理方法
    public abstract void processRequest(PurchaseRequest request);
}
