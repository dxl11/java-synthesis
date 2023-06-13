package com.dxl.designpatterns.singletonPattern;

/**
 * 饿汉式单例类.在类初始化时，已经自行实例化
 * @author Administrator
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }
}
