package cn.cian.base.a7_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Host {
    private final Helper helper = new Helper();

    public void request(final int count, final char c) {
        log.info("    request(" + count + ", " + c + ") BEGIN");
        new Thread() {
            public void run() {
                helper.handle(count, c);
            }
        }.start();
        log.info("    request(" + count + ", " + c + ") END");
    }
}