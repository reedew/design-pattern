package apr.conc;

import apr.Approver;
import req.PurchaseRequest;

/**
 * 董事长类
 */
public class President extends Approver {
    public President(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            System.out.println("董事长" + this.name + "审批采购单：" + request);
        } else {
            this.successor.processRequest(request);
        }
    }
}
