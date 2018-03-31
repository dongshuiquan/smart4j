package com.smart4j.framework.helper;

import com.smart4j.framework.annotation.Inject;
import com.smart4j.framework.util.ReflectionUtil;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by DELL on 2018/3/31.
 */
public final class IocHelper {

    static {
        Map<Class<?>, Object> beanMap =BeanHelper.getBeanMap();
        if(!beanMap.isEmpty()) {
            for(Map.Entry<Class<?>, Object> beanEntry : beanMap.entrySet()) {
                Class<?> beanClass = beanEntry.getKey();
                Object beanInstance = beanEntry.getValue();
                Field[] beanFields = beanClass.getDeclaredFields();
                if(ArrayUtils.isNotEmpty(beanFields)) {
                    for(Field beanField : beanFields) {
                        if(beanField.isAnnotationPresent(Inject.class)) {
                            Class<?> beanFieldClass = beanField.getType();
                            Object beanFieldInstance = beanMap.get(beanFieldClass);
                            if(beanFieldInstance != null) {
                                ReflectionUtil.setField(beanInstance, beanField, beanFieldInstance);
                            }
                        }
                    }
                }
            }
        }
    }
}
