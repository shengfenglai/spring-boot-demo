package spring.boot.demo.mapper;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.boot.demo.bean.RandomProperties;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RandomTest {

    @Autowired
    private RandomProperties rp;

    @Test
    public void testRandom() {
        System.out.println(rp.getNum());
        System.out.println(rp.getValue());
        System.out.println(rp.getBignum());
        System.out.println(rp.getVerifynum());
        Assert.assertNotEquals(rp.getValue(), 0);
    }

}
