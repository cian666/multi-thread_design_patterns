package cn.cian.base.a5_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Table {
    private final String[] buffer;
    private int put;
    private int take;
    private int count;

    public Table( int size) {
        this.buffer = new String[size];
        this.put = 0;
        this.take = 0;
        this.count = count;
    }
    public synchronized void put(String cake){
        try {
            while(count >= buffer.length){
                wait();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        buffer[put] = cake;
        put = (put + 1) % buffer.length;
        log.info("【table】create the take: " + cake );
        notify();
    }
    public synchronized String take(){
        try {
            while(count <= 0){
                wait();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        count--;
        String cake = buffer[take];
        take = (take +1)% buffer.length;
        log.info("【table】take the cake:" + cake);
        notify();
        return cake;
    }
}
