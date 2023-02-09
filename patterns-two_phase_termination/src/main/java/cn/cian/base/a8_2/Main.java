package cn.cian.base.a8_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        log.info("main: BEGIN");
        try {
            // 启动线程
            CountupThread t = new CountupThread();
            t.start();

            // 稍微间隔一段时间
            Thread.sleep(10000);

            // 线程的终止请求
            log.info("main: shutdownRequest");
            t.shutdownRequest();

            log.info("main: join");

            // 等待线程终止
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("main: END");
    }
}
