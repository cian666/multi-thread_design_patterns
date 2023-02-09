package cn.cian.base.a6_2;
/***
 * 读写模式
 *
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Data data = new Data(10);
        new WriterThread(data, "ABCDEFGHIJKLMNOPQTSTUVWXYZ").start();
        new WriterThread(data, "abcdefghijklmnopqrstuvwxyz").start();
        Thread.sleep(5000);
        new ReaderThread(data).start();
        new ReaderThread(data).start();
    }
}
