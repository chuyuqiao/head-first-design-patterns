package com.design.patterns.profxy;

import org.junit.Test;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;

public class ProxyFactoryTest {
    @Test
    public void test() {
        ProxyFactory factory = new ProxyFactory(new House());
        factory.addInterface(Construction.class);
        factory.addAdvice(new BeforeConstructAdvice());
        factory.setExposeProxy(true);

        Construction construction = (Construction) factory.getProxy();
        construction.construct();
        assertTrue("Construction is illegal. "
                + "Supervisor didn't give a permission to build "
                + "the house", construction.isPermitted());
    }

}

interface Construction {
    void construct();
    void givePermission();
    boolean isPermitted();
}

class House implements Construction{

    private boolean permitted = false;

    @Override
    public boolean isPermitted() {
        return this.permitted;
    }

    @Override
    public void construct() {
        System.out.println("I'm constructing a house");
    }

    @Override
    public void givePermission() {
        System.out.println("Permission is given to construct a simple house");
        this.permitted = true;
    }
}

class BeforeConstructAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] arguments, Object target) throws Throwable {
        if (method.getName().equals("construct")) {
            ((Construction) target).givePermission();
        }
    }

}
