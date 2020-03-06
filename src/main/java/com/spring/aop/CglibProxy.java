package com.spring.aop;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : mawei
 * @description : TODO
 * @since : 2019-10-09 13:38
 */
public class CglibProxy implements MethodInterceptor {
    private Object target;

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy var4) throws Throwable{
        System.out.println("jdk动态代理开始...");
        Object result = method.invoke(target, args);
        System.out.println("jdk动态代理结束...");
        return result;
    }

    public Object getCglibProxy(Object objectTarget){
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(objectTarget.getClass());
        //设置回调
        enhancer.setCallback(this);
        Object result = enhancer.create();//创建并返回代理对象
        return result;
    }

    public static void main(String []args){
        CglibProxy cglibProxy = new CglibProxy();
        UserService userService =(UserService) cglibProxy.getCglibProxy(new UserServiceImpl());
        userService.saveUser();
        userService.delUser();
    }
}
