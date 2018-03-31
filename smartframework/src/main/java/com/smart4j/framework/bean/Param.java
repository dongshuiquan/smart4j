package com.smart4j.framework.bean;

import com.smart4j.chapter2.util.CastUtil;

import java.util.Map;

/**
 * Created by DELL on 2018/4/1.
 */
public class Param {
    private Map<String, Object> paramMap;

    public Map<String, Object> getMap() {
        return paramMap;
    }

    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }
}
