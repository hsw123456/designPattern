package com.hsw.designPattern.ioc;

public class ShiyanlouImpl implements Shiyanlou {
    @Override
    public String toUp(String s) {
        if (null != s && !"".equals(s)) {
            return s.toUpperCase();
        }
        return null;
    }
}
