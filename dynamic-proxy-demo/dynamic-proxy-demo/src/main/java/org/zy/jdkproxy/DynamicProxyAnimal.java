package org.zy.jdkproxy;

import java.lang.reflect.Proxy;

public class DynamicProxyAnimal {

    public static Object getProxy(Object target) {
        Object proxy = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new TargetInvoker(target));
        return proxy;
    }

}
