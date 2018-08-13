package com.hsw.designPattern.ioc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    // TODO
    public static void ioc(String className, Shiyanlou s, String methodName, String name) {

        try {
            Class c = Class.forName(className);
            Object o = c.newInstance();
            Field[] fields = c.getDeclaredFields();
            for (Field f : fields) {
                if (f.getType().isAssignableFrom(Shiyanlou.class)) {
                    String fName = f.getName();
                    String setName = "set" + fName.substring(0, 1).toUpperCase() + fName.substring(1);
                    Method method = c.getDeclaredMethod(setName, Shiyanlou.class);
                    method.invoke(o, s);
                }
            }
            Method method = c.getDeclaredMethod(methodName, String.class);
            method.invoke(o, name);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
