package cn.cian.base.a4_2;

import java.io.IOException;
import java.util.Random;

public class ChangerThread extends Thread{
    private final Data data;
    private final Random random = new Random();

    public ChangerThread(Data data) {
        super("changer");
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            try {
                data.change(i+" ");
                Thread.sleep(random.nextInt(1000));
                data.save();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
}
