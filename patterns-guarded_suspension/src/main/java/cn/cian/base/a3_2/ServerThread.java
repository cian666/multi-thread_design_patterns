package cn.cian.base.a3_2;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class ServerThread extends Thread {
    private final Random random;
    private final RequestQueue requestQueue;

    public ServerThread(RequestQueue requestQueue, String name, long seed) {
        super(name);
        this.requestQueue = requestQueue;
        this.random = new Random(seed);
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            Request request = requestQueue.getRequest();
            log.info("  handles  " + request);
            try {
                Thread.sleep(random.nextInt(3000));
            } catch (InterruptedException e) {
            }
        }
    }
}