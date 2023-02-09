package cn.cian.base.a8_2;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

@Slf4j
public class RealData implements Data{
    private final String content;

    public RealData(int count,char c) {

        log.info("making RealData (" + count + "," + c + ") BEGIN");
        char[] buffer = new char[count];
        Arrays.fill(buffer,c);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("making RealData (" + count + "," + c + ") END");
        content = new String(buffer);
    }

    @Override
    public String getContent() {
        return content;
    }
}
