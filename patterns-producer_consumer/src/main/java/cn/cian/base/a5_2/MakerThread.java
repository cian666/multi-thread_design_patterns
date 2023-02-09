package cn.cian.base.a5_2;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class MakerThread extends Thread{
    private final Table table;
    private final Random random;
    private static int id = 0;
    public MakerThread(String name, Table table, long seed) {
        super(name);
        this.table = table;
        this.random = new Random(seed);
    }

    @Override
    public void run() {
        try {
            while(true){
                Thread.sleep(random.nextInt(1000));
                String cake = "[ cake No." + nextId()+ " by " + getName() + " ]";
                table.put(cake);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized int nextId(){
        return id++;
    }
}
