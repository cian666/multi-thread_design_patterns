package cn.cian.base.a8_2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Host host = new Host();
        Data data = host.request(5, 'A');
        log.info("获取数据...");
        log.info("获取成功：" + data.getContent());
    }
}
