package cn.cian.base.a2_2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", "山东省");
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
        new PrintPersonThread(person).start();
    }
}
