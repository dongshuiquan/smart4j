package com.smart4j.framework.util;

import org.junit.Test;

import java.util.Set;

/**
 * Created by DELL on 2018/3/31.
 */
public class ClassUtilTest {

    @Test
    public void testLoad() {
        Set<Class<?>> classSet = ClassUtil.getClassSet("com.dsq");
        System.out.println(classSet);
        classSet = ClassUtil.getClassSet("org.junit.internal.runners.model");
        System.out.println(classSet);
    }
}
