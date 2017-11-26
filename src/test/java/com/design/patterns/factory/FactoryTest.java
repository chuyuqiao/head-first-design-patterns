package com.design.patterns.factory;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@ContextConfiguration("/applicationContext-test.xml")
public class FactoryTest {
    @Autowired
    private BeanFactory factory;

    @Test
    public void test() {
        System.out.println("Concrete factory is: "+factory.getClass());
        assertTrue("Factory can't be null", factory != null);
    }
}
