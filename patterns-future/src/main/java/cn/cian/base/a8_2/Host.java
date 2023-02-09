package cn.cian.base.a8_2;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Host {

    public Data request(final int count,final char c){
        log.info("request( " + count + " , " + c + ") BEGIN");
        final FutureData data = new FutureData();
        new Thread(new Runnable() {
            @Override
            public void run() {
                RealData realData = new RealData(count, c);
                data.setRealData(realData);
            }
        }).start();
        return data;
    }
}
