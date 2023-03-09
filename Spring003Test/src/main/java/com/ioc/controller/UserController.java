package com.ioc.controller;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller("uc")
public class UserController {
    private UserService userService;

    @Autowired
    @Qualifier("s2")
    public void setUserService( UserService userService) {
        this.userService = userService;
    }

    public double ff(double n1,double n2){
        return userService.ff(n1,n2);
    }
}
