package spring.boot.demo.service;

import spring.boot.demo.bean.UserBean;

public interface UserService {

    void insertService(UserBean userBean);

    UserBean findUserById(int id);
    
}
