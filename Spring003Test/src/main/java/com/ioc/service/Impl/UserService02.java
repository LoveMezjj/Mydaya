package com.ioc.service.Impl;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("s2")
public class UserService02 implements UserService {

    @Override
    public double ff(double num1, double num2) {
        System.out.println("减法");
        return num1-num2;
    }
}
