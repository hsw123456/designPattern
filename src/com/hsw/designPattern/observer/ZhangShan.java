package com.hsw.designPattern.observer;

/**
 * @author hushuwei
 * @Type ZhangShan.java
 * @Desc
 * @date 2018/8/9 9:59
 */
public class ZhangShan implements Observer {
    @Override
    public void update(Subject subject) {
        XiaoMing xm = (XiaoMing) subject;
        System.out.println("张三得到通知："+ xm.getState() + "张三说：改吃药了");
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
