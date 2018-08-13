package com.hsw.designPattern.producerAndconsumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author hushuwei
 * @Type Main.java
 * @Desc
 * @date 2018/8/9 14:45
 */
public class Main {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new LinkedBlockingDeque<>(10);

        Thread proudcer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        proudcer.start();
        consumer.start();
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
