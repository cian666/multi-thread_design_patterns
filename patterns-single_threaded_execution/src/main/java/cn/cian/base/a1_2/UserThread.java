package cn.cian.base.a1_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserThread extends Thread {
    private Gate gate;
    private String myname;
    private String myaddress;

    public UserThread(Gate gate, String myname, String myaddress) {
        this.gate = gate;
        this.myname = myname;
        this.myaddress = myaddress;
    }

    public void run() {
        log.info(myname + " BEGIN");
        while (true) {
            gate.pass(myname, myaddress);
        }
    }
}