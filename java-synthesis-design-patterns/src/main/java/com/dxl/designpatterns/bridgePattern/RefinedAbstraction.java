package com.dxl.designpatterns.bridgePattern;

/**
 * 修正抽象画角色
 */
public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 其他的操作方法
     */
    public void otherOperation() {

    }
}
