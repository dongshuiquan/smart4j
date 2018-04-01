package com.smart4j.test;

import com.smart4j.controller.HelloController;
import com.smart4j.framework.HelpLoader;
import com.smart4j.framework.helper.BeanHelper;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by DELL on 2018/4/1.
 */


public class HelloTest {

    @BeforeClass
    public static void beforeClass() {
        HelpLoader.init();
    }

    @Test
    public void testIOC() {
        HelloController helloController = BeanHelper.getBean(HelloController.class);
        System.out.println(helloController.sayHello("smart4j"));
    }

}
