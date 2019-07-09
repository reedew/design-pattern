package client;

import apr.Approver;
import apr.conc.Congress;
import apr.conc.Director;
import apr.conc.President;
import apr.conc.VicePresident;
import req.PurchaseRequest;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        Approver lhc;
        Approver fqy;
        Approver dgqb;
        Approver meeting;
        lhc = new Director("令狐冲");
        fqy = new VicePresident("风清扬");
        dgqb = new President("独孤求败");
        meeting = new Congress("董事会");
        // 创建职责链
        lhc.setSuccessor(fqy);
        fqy.setSuccessor(dgqb);
        dgqb.setSuccessor(meeting);
        // 创建采购单
        PurchaseRequest req1 = new PurchaseRequest(45000, 10001, "购买琴");
        PurchaseRequest req2 = new PurchaseRequest(60000, 10002, "购买棋");
        PurchaseRequest req3 = new PurchaseRequest(160000, 10003, "购买书");
        PurchaseRequest req4 = new PurchaseRequest(800000, 10004, "购买画");
        // 执行采购流程
        lhc.processRequest(req1);
        lhc.processRequest(req2);
        lhc.processRequest(req3);
        lhc.processRequest(req4);
    }
}
