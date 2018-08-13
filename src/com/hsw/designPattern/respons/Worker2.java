package com.hsw.designPattern.respons;

/**
 * @author hushuwei
 * @Type Worker2.java
 * @Desc
 * @date 2018/8/8 20:31
 */
public class Worker2 implements IWorker {
    private IWorker next;
    @Override
    public void handleIphone(Iphone iphone) {
        iphone.setState(iphone.getState()+ "我被装了一块电池->");
        if(next != null){
            next.handleIphone(iphone);
        }
    }

    @Override
    public void setNext(IWorker worker) {
        this.next = worker;
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018/8/8 hushuwei creat
 */
