package common.impl;

import common.itfc.Prototype;

import java.util.Objects;

/**
 * 具体原型类
 */
public class ConcretePrototype implements Prototype {
    private String attr = null;// 成员属性

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

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype();// 创建新对象
        ((ConcretePrototype) prototype).setAttr(this.attr);
        return prototype;
    }
}
