package cn.cian.base.a12_2;

import cn.cian.base.a12_2.activeObject.ActiveObject;
import cn.cian.base.a12_2.activeObject.Result;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddClientThread extends Thread {
    private final ActiveObject activeObject;
    private String x = "1";
    private String y = "1";

    public AddClientThread(String name, ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
    }

    public void run() {
        try {
            for (int i = 0; true; i++) {
                // 有返回值的调用
                Result<String> result = activeObject.add(x, y);
                Thread.sleep(1000);
                String z = result.getResultValue();
                log.info(  ": " + x + " + " + y + " = " + z);
                x = y;
                y = z;
            }
        } catch (InterruptedException e) {
        }
    }
}