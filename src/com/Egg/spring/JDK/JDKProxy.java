package com.Egg.spring.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UDao.class};
        UDaoImpl uDao = new UDaoImpl();

        //创建接口实现类的代理对象
        UDao dao = (UDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UDaoProxy(uDao));
        int res = dao.add(1, 2);

        System.out.println("result:" + res);
    }
}

class UDaoProxy implements InvocationHandler {
    //1 创建的是谁的代理对象，就把谁传递过来
    //有参构造
    private Object obj;

    public UDaoProxy(Object obj) {
        this.obj = obj;
    }

    @Override
    //增强的逻辑
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("在" + method.getName() + "方法执行之前...传递的参数为" + Arrays.toString(args));

        //被增强的方法
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("在" + method.getName() + "方法之后..." + obj);

        System.out.println(res);

        return res;
    }
}
