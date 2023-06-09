package com.dxl.designpatterns.factoryPattern.AbstractFactory;

public class BenzSFactory implements BenzFactory {
    /**
     * 生产发动机
     *
     * @return
     */
    @Override
    public Engine createEngine() {
        return new EngineS();
    }

    /**
     * 生产空调
     *
     * @return
     */
    @Override
    public Aircondition createAircontion() {
        return new AirconditionS();
    }
}
