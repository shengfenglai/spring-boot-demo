package spring.boot.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import spring.boot.demo.bean.UserBean;

@Mapper
public interface UserMapper {

    void insertUser(UserBean userBean);

    UserBean findUserById(int id);

}
