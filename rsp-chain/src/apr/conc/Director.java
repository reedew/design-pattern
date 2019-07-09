package apr.conc;

import apr.Approver;
import req.PurchaseRequest;

/**
 * 主任类
 */
public class Director extends Approver {
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任" + this.name + "审批采购单：" + request);
        } else {
            this.successor.processRequest(request);// 转发请求
        }
    }
}
