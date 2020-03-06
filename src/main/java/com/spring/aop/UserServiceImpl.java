package com.spring.aop;

/**
 * @author : mawei
 * @description :
 * @since : 2019-10-09 10:29
 */
public class UserServiceImpl implements UserService {

    @Override
    public void delUser() {
     System.out.println("delUser ...");
    }

    @Override
    public void saveUser(){
      System.out.println("saveUser ...");
    }
}
