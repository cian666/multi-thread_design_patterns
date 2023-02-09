package cn.cian.base.a4_2;

import java.io.IOException;

public class SaverThread extends Thread{
    private final Data data;
    public SaverThread(Data data){
        super("saver");
        this.data = data;
    }
    @Override
    public void run() {
        try {
            while(true){
                data.save();
                Thread.sleep(1000);
            }
        }catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
