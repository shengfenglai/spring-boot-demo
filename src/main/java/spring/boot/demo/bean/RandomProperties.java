package spring.boot.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomProperties {

    // 随机生成的字符串
    @Value("${spring.boot.demo.value}")
    private String value;

    // 随机生成的int
    @Value("${spring.boot.demo.num}")
    private int num;

    // 随机生成的long
    @Value("${spring.boot.demo.bignum}")
    private double bignum;

    // 随机生成十以内的数字
    @Value("${spring.boot.demo.verifynum}")
    private int verifynum;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getBignum() {
        return bignum;
    }

    public void setBignum(double bignum) {
        this.bignum = bignum;
    }

    public int getVerifynum() {
        return verifynum;
    }

    public void setVerifynum(int verifynum) {
        this.verifynum = verifynum;
    }

}
