package com.hsw.designPattern.observer;

/**
 * @author hushuwei
 * @Type XiaoWang.java
 * @Desc
 * @date 2018/8/9 9:56
 */

/**
 * 具体观察者1
 */
public class XiaoWang implements Observer {
    @Override
    public void update(Subject subject) {
        XiaoMing xm = (XiaoMing)subject;

        System.out.println("小王得到通知： " + xm.getState() + "小王说：活该！");
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
