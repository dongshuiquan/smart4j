package com.smart4j.framework;

import com.smart4j.framework.helper.*;
import com.smart4j.framework.util.ClassUtil;

/**
 * Created by DELL on 2018/4/1.
 */
public final class HelpLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for(Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}
