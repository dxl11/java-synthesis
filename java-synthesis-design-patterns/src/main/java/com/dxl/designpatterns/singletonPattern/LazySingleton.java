package com.dxl.designpatterns.singletonPattern;

/**
 * 懒汉式单例模式，只有在创建时，才实例化
 *
 * @author Administrator
 */
public class LazySingleton {

    private LazySingleton() {
    }

    private volatile static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
