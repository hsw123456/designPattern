package com.hsw.designPattern.respons;

/**
 * @author hushuwei
 * @Type IWorker.java
 * @Desc
 * @date 2018/8/8 20:26
 */

/**
 * 抽象处理接口类
 */
public interface IWorker {
    /**
     * 处理方法
     * @param iphone
     */
    void handleIphone(Iphone iphone);

    /**
     * 设置下一个处理者
     * @param worker
     */
    void setNext(IWorker worker);
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018/8/8 hushuwei creat
 */