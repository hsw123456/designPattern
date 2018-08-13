package com.hsw.designPattern.observer;

/**
 * @author hushuwei
 * @Type Client.java
 * @Desc
 * @date 2018/8/9 10:07
 */
public class Client {

    public static void main(String[] args) {
        XiaoMing xm = new XiaoMing();
        XiaoWang xw = new XiaoWang();
        ZhangShan zs = new ZhangShan();

        xm.addObserver(xw);
        xm.addObserver(zs);
        //状态改变了
        xm.setState("小明病了");
        //通知观察者，状态改变了
        xm.change();
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
