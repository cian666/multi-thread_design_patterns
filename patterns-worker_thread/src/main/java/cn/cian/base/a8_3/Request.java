package cn.cian.base.a8_3;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Request {
    private final String name;
    private final int number;

    public Request(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public void execute() {
        log.info(" executes " + this);
    }

    public String toString() {
        return "[ Request from " + name + " No." + number + " ]";
    }
}