package jo.impl;

import jo.itfc.JOPrototype;

import java.util.Objects;

/**
 * 具体原型类
 * <p>
 * 使用java的Object类提供的clone()方法实现克隆
 */
public class ConcretePrototype implements Cloneable, JOPrototype {
    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConcretePrototype that = (ConcretePrototype) o;
        return Objects.equals(attr, that.attr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attr);
    }

    public JOPrototype clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (JOPrototype) object;
    }

}
