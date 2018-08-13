package com.hsw.designPattern.ioc.testField;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hushuwei
 * @Type Main.java
 * @Desc
 * @date 2018/8/9 16:40
 */
public class Main {

    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.hsw.designPattern.ioc.testField.Person");
            Object o = clazz.newInstance();
            List<Field> fields = findAllField(clazz, String.class);
            for (Field f : fields) {
                f.setAccessible(true);
                System.out.println(f.getName());
                f.set(o, "hsw");
            }
            System.out.println(o);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Field> findAllField(Class clazz, Class type) {

        List<Field> list = new ArrayList<>();
        Class searchType = clazz;
        while (null != searchType && Object.class!= searchType) {
            Field[] fields = searchType.getDeclaredFields();
            for (Field f : fields) {
                if (type == f.getType()) {
                    list.add(f);
                }
            }
            searchType = searchType.getSuperclass();
        }
        return list;
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018/8/9 hushuwei creat
 */
