package cn.cian.base.a8_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FutureData implements Data{
    private RealData realData = null;
    private boolean ready = false;
    public synchronized void setRealData(RealData realData){
        if(ready){
            return;
        }
        this.realData = realData;
        this.ready = true;
        notify();
    }
    @Override
    public synchronized String getContent() {
        try {
            while(!ready){
                log.info("wating for realdata....");
                wait();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        return realData.getContent();
    }
}
