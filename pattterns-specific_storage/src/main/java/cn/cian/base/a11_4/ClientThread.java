package cn.cian.base.a11_4;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ClientThread extends Thread {
    public ClientThread(String name) {
        super(name);
    }

    public void run() {
        log.info( " BEGIN");
        for (int i = 0; i < 10; i++) {
            Log.println("i = " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        // 不再需要Log.close()
        log.info( " END");
    }
}