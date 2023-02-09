package cn.cian.base.a4_4;

/**
 * 初始化方法只执行一次
 */
public class Something {
    private boolean initialized = false;

    public synchronized void init() {
        if (initialized) {
            return;
        }
        doInit();
        initialized = true;
    }

    private void doInit() {
        // 实际的初始化处理
    }
}
