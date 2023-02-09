package cn.cian.base.a12_2.activeObject;

public interface ActiveObject {
    public abstract Result<String> makeString(int count, char fillchar);

    public abstract void displayString(String string);

    public abstract Result<String> add(String x, String y);
}