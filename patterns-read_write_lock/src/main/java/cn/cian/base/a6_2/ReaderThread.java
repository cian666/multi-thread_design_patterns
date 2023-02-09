package cn.cian.base.a6_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReaderThread extends Thread {
    private final Data data;

    public ReaderThread(Data data) {
        super("Read");
        this.data = data;
    }

    public void run() {
        try {
            while (true) {
                char[] readbuf = data.read();
                log.info(Thread.currentThread().getName() + " reads " + String.valueOf(readbuf));
            }
        } catch (InterruptedException e) {
        }
    }
}