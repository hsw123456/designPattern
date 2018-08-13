package com.hsw.designPattern.observer;

/**
 * @author hushuwei
 * @Type Subject.java
 * @Desc
 * @date 2018/8/9 9:46
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题类，被观察者
 */
public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    /**
     * 增加一个观察者
     * @param observer
     */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除一个观察者
     * @param observer
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有观察者事件改变
     */
    public void notifyAllObservers(){
        for(Observer observer: observers){
            observer.update(this);
        }
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
