package weeklog.deep.client;

import weeklog.deep.server.Attachment;
import weeklog.deep.server.WeeklyLog;

import java.io.IOException;

/**
 * 客户端测试
 */
public class Client {
    public static void main(String[] args) {
        WeeklyLog log_previous = null;
        WeeklyLog log_new = null;
        log_previous = new WeeklyLog();// 创建原型对象
        Attachment attachment = new Attachment();// 创建附件对象
        log_previous.setAttachment(attachment);
        try {
            log_new = log_previous.deepClone();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 判断是否相同
        System.out.println("周报是否相同：" + (log_previous == log_new));
        System.out.println("附件是否相同：" + (log_previous.getAttachment() == log_new.getAttachment()));
    }
}
