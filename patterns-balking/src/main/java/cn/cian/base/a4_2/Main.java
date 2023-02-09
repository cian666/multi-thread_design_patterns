package cn.cian.base.a4_2;

/**
 * 保存数据
 */
public class Main {

    public static void main(String[] args) {
        Data data = new Data("D:/data.txt");
        new ChangerThread(data).start();
        new SaverThread(data).start();
    }
}
