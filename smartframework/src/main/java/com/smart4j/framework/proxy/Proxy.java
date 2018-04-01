package com.smart4j.framework.proxy;

/**
 * Created by DELL on 2018/4/1.
 */
public interface Proxy {

    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
