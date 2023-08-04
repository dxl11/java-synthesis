package com.dxl.designpatterns.bridgePattern;

/**
 * 抽象化角色类，它声明了一个方法operation()，并给出了它的实现。
 *这个实现是通过向实现化对象的委派(也就是调用实现化对象的operationImpl()方法)实现的。
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    /**
     * 示例方法
     */
    public void operation() {
        implementor.operationImpl();
    }
}
