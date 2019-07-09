package document.client;

import document.itfc.OfficialDocument;
import document.manager.PrototypeManager;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        // 获取原型管理器对象
        PrototypeManager pm = PrototypeManager.getPrototypeManager();
        // 通过管理器获取公文对象
        OfficialDocument doc1 = null;
        OfficialDocument doc2 = null;
        OfficialDocument doc3 = null;
        OfficialDocument doc4 = null;
        doc1 = pm.getOfficialDocument("far");
        doc1.display();
        doc2 = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);
        doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        doc4 = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);
    }
}
