package spring.boot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.demo.bean.UserBean;
import spring.boot.demo.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/get-user-info.htm")
    public UserBean findUserById(@RequestParam("id") Integer id) {
        UserBean userBean = null;

        if (id > 0) {
            userBean = userService.findUserById(id);
        }

        return userBean;
    }
}
