package cn.cian.base.a12_2;

import cn.cian.base.a12_2.activeObject.ActiveObject;
import cn.cian.base.a12_2.activeObject.Result;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MakerClientThread extends Thread{
    private final ActiveObject activeObject;
    private final char fill;

    public MakerClientThread(String name,ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
        this.fill = name.charAt(0);
    }


    @Override
    public void run() {
        for (int i = 0; true ; i++) {
            try {
                Result<String> result = activeObject.makeString(i, fill);
                Thread.sleep(1000);
                String value = result.getResultValue();
                log.info("maker value is : " + value);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
