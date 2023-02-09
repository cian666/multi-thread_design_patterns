package cn.cian.base.a2_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintPersonThread extends Thread{
    private Person person;

    public PrintPersonThread(Person person){
        this.person = person;
    }

    @Override
    public void run() {
        while (true){
            log.info("print: " + person);
        }
    }
}
