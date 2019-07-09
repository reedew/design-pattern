package document.manager;

import document.impl.FAR;
import document.impl.SRS;
import document.itfc.OfficialDocument;

import java.util.Hashtable;

/**
 * 原型管理器
 */
public class PrototypeManager {
    // 用于存储原型对象
    private Hashtable ht = new Hashtable();
    // 饿汉式单例实现
    private static PrototypeManager pm = new PrototypeManager();

    public static PrototypeManager getPrototypeManager() {
        return pm;
    }

    // 为ht增加公文对象
    private PrototypeManager() {
        ht.put("far", new FAR());
        ht.put("srs", new SRS());
    }

    // 增加新的公文对象
    public void addOfficialDocument(String key, OfficialDocument doc) {
        ht.put(key, doc);
    }

    // 通过浅克隆获取新的公文对象
    public OfficialDocument getOfficialDocument(String key) {
        return ((OfficialDocument) ht.get(key)).clone();
    }
}
