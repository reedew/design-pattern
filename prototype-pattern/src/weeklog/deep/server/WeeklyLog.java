package weeklog.deep.server;

import java.io.*;

/**
 * 可实现序列化的周报类
 */
public class WeeklyLog implements Serializable {
    private static final long serialVersionUID = 2322548601620105274L;
    private Attachment attachment = null;
    private String name = null;
    private String date = null;
    private String content = null;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // 使用序列化技术实现深克隆
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        // 将对象写入流
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);
        // 将对象从流中取出
        ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bai);
        return (WeeklyLog) ois.readObject();
    }

}
