package cn.cian.base.a7_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Helper {
    public void handle(int count, char c) {
        log.info("        handle(" + count + ", " + c + ") BEGIN");
        for (int i = 0; i < count; i++) {
            slowly();
//            log.info("current:" + i+" " + c);
        }
        log.info("        handle(" + count + ", " + c + ") END");
    }

    private void slowly() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}