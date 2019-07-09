package apr.conc;

import apr.Approver;
import req.PurchaseRequest;

/**
 * 董事会类
 */
public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request);
    }
}
