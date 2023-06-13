package com.dxl.designpatterns.singletonPattern;

/**
 *利用了类加载机制来保证初始化 instance 时只有一个线程，所以也是线程安全的
 * @author Administrator
 */
public class LazySingletonHolder {
    private LazySingletonHolder() {
    }

    private static class holder {
        private static final LazySingletonHolder lazySingletonHolder = new LazySingletonHolder();
    }

    private static LazySingletonHolder getInstance() {
        return holder.lazySingletonHolder;
    }
}
