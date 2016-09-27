package spring.boot.demo.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.boot.demo.bean.UserBean;

@RunWith(SpringJUnit4ClassRunner.class)
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsertUser() {
        UserBean userBean = new UserBean();
        userBean.setUserName("springBoot");
        userBean.setPassword("123");
        userBean.setPhone("13111223344");
        userMapper.insertUser(userBean);
    }

}
