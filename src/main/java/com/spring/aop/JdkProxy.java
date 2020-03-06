package com.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author : mawei
 * @description :
 * @since : 2019-10-09 10:31
 */
public class JdkProxy implements InvocationHandler {
    /**
     * 代理目标对象
     */
    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("jdk动态代理开始...");
        Object result = method.invoke(target, args);
        System.out.println("jdk动态代理结束...");
        return result;
    }

    public Object  getJDKProxy(Object targetObject){
        this.target = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(), this);
    }

    public static void main(String []args){
       JdkProxy jdkProxy = new JdkProxy();
       UserService userService = (UserService) jdkProxy.getJDKProxy(new UserServiceImpl());
       userService.saveUser();
    }
}
