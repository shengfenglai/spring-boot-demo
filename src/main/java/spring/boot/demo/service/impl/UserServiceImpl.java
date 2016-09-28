package spring.boot.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.demo.bean.UserBean;
import spring.boot.demo.mapper.UserMapper;
import spring.boot.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void insertService(UserBean userBean) {
        userMapper.insertUser(userBean);

    }

    @Override
    public UserBean findUserById(int id) {
        return userMapper.findUserById(id);
    }

}
