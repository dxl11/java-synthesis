package com.dxl.designpatterns.factoryPattern.AbstractFactory;

public class BenzEFactory implements BenzFactory {
        /**
     * 生产奔驰E的发动机
     * @return
     */
    @Override
    public Engine createEngine() {
        return new EngineE();
    }

    /**
     * 生产奔驰E的空调
     * @return
     */
    @Override
    public Aircondition createAircontion() {
        return new AirconditionE();
    }
}
