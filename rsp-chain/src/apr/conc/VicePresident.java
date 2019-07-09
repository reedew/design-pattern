package apr.conc;

import apr.Approver;
import req.PurchaseRequest;

/**
 * 副董事长类
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" + this.name + "审批采购单：" + request);
        } else {
            this.successor.processRequest(request);
        }
    }
}
