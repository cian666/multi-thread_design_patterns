package cn.cian.base.a12_2.activeObject;

import lombok.extern.slf4j.Slf4j;

import java.math.BigInteger;

@Slf4j
class Servant implements ActiveObject {
    public Result<String> makeString(int count, char fillchar) {
        char[] buffer = new char[count];
        for (int i = 0; i < count; i++) {
            buffer[i] = fillchar;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        return new RealResult<String>(new String(buffer));
    }

    public void displayString(String string) {
        try {
            log.info("displayString: " + string);
            Thread.sleep(10);
        } catch (InterruptedException e) {
        }
    }

    public Result<String> add(String x, String y) {
        String retvalue = null;
        try {
            BigInteger bigX = new BigInteger(x);
            BigInteger bigY = new BigInteger(y);
            BigInteger bigZ = bigX.add(bigY);
            retvalue = bigZ.toString();
        } catch (NumberFormatException e) {
            retvalue = null;
        }
        return new RealResult<String>(retvalue);
    }
}