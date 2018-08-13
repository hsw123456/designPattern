package com.hsw.designPattern.observer;

/**
 * @author hushuwei
 * @Type XiaoMing.java
 * @Desc
 * @date 2018/8/9 9:53
 */

/**
 * 实际被观察者
 */
public class XiaoMing extends Subject {

    private String state;

    /**
     * 实际要进行通知的方法
     */
    public void change() {
        this.notifyAllObservers();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
