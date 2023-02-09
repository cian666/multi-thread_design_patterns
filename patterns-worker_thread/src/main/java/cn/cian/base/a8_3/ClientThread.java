package cn.cian.base.a8_3;

import java.util.Random;

public class ClientThread extends Thread {
    private final Channel channel;
    private final Random random;
    public ClientThread(String name, Channel channel) {
        super(name);
        this.channel = channel;
        random = new Random();
    }

    public void run() {
        try {
            for (int i = 0; true; i++) {
                Thread.sleep(random.nextInt(1000));
                Request request = new Request(getName(), i);
                channel.putRequest(request);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}