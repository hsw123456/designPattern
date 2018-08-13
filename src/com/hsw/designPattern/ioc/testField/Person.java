package com.hsw.designPattern.ioc.testField;

/**
 * @author hushuwei
 * @Type Person.java
 * @Desc
 * @date 2018/8/9 16:40
 */
public class Person extends Animal {

    private String name;
    private Integer age;
    private String school;
    private String company;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[name=" + name);
        sb.append(", age=" + age);
        sb.append(", school=" + school);
        sb.append(", company=" + company);
        sb.append(", home=" + Home+"]");
        return sb.toString();

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
