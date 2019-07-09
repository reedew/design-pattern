package weeklog.shallow.server;

import java.util.Objects;

/**
 * 周报类
 */
public class WeeklyLog implements Cloneable {
    private String name;
    private String date;
    private String content;
    private Attachment attachment;

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

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeeklyLog weeklyLog = (WeeklyLog) o;
        return Objects.equals(name, weeklyLog.name) &&
                Objects.equals(date, weeklyLog.date) &&
                Objects.equals(content, weeklyLog.content) &&
                Objects.equals(attachment, weeklyLog.attachment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, date, content, attachment);
    }

    // 浅克隆：赋值值类型变量和引用对象的地址值
    public WeeklyLog clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (WeeklyLog) obj;
    }
}
