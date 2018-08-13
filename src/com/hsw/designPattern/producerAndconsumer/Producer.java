package com.hsw.designPattern.producerAndconsumer;

/**
 * @author hushuwei
 * @Type Producer.java
 * @Desc
 * @date 2018/8/9 14:32
 */

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

class Producer implements Runnable {
    private final BlockingQueue<String> queue;

    public Producer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            try {
                queue.put(String.valueOf(i));
                System.out.println("Complete Production:course" + i);
                TimeUnit.MILLISECONDS.sleep(100);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
