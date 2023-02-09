package cn.cian.base.a1_3;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Gate {

    private int counter = 0;
    private String name = "Nobody";
    private String address = "Nowhere";

    public synchronized void pass(String name, String address) {
        this.counter++;
        this.name = name;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        this.address = address;
        check();
        log.info("pass");
    }

    public synchronized String toString() {
        return "No." + counter + ": " + name + ", " + address;
    }

    private void check() {
        if (name.charAt(0) != address.charAt(0)) {
           log.info("***** BROKEN ***** " + toString());
        }
    }
}