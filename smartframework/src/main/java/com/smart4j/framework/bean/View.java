package com.smart4j.framework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DELL on 2018/4/1.
 */
public class View {
    private String path;
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        this.model = new HashMap<String, Object>();
    }

    public View addModel(String key, Object value) {
        this.model.put(key, value);
        return this;
    }

    public String getPath() {
        return path;
    }

    public Map<String, Object> getModel() {
        return model;
    }
}
