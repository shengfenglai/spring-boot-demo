package spring.boot.demo.mapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Log4j2Test {

    private static Logger logger = LogManager.getLogger(Log4j2Test.class);

    @Test
    public void testLog4j2() {
        logger.info("this is info log");
        logger.error("this is error log");
        logger.warn("this is warn log");
    }

}
