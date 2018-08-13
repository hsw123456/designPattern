package com.hsw.designPattern.producerAndconsumer;

/**
 * @author hushuwei
 * @Type Consumer.java
 * @Desc
 * @date 2018/8/9 14:27
 */

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {

    private final BlockingQueue<String> queue;

    public Consumer(BlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for(int i=1; i<=10 ; ++i){
            try {
                String res  = queue.take();
                System.out.println("Complete consumption: course"+res);
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
