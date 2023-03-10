package cn.cian.base.a8_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountupThread extends Thread {
    // 计数值
    private long counter = 0;
    // 发出终止请求后变为true
    private volatile boolean shutdownRequested = false;
    // 终止请求
    public void shutdownRequest() {
        shutdownRequested = true;
        interrupt();
    }

    // 线程体
    public void run() {
        try {
            while (!shutdownRequested) {
                doWork();
            }
        } catch (InterruptedException e) {
        } finally {
            doShutdown();
        }
    }

    // 操作
    private void doWork() throws InterruptedException {
        counter++;
        log.info("doWork: counter = " + counter);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
    }

    // 终止处理
    private void doShutdown() {
        log.info("doShutdown: counter = " + counter);
    }
}