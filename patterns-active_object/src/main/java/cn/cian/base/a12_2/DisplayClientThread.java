package cn.cian.base.a12_2;

import cn.cian.base.a12_2.activeObject.ActiveObject;
import cn.cian.base.a12_2.activeObject.Result;

public class DisplayClientThread extends Thread{
    private final ActiveObject activeObject;

    public DisplayClientThread(String name,ActiveObject activeObject) {
        super(name);
        this.activeObject = activeObject;
    }


    @Override
    public void run() {
        for (int i = 0; true ; i++) {
            try {
                String s = Thread.currentThread().getName() + "-" + i;
                activeObject.displayString(s);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
