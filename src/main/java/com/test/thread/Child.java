package com.test.thread;

import java.util.concurrent.TimeUnit;

/**
 * @author zhuyoulong
 * @date 2018年-07月-27日
 * <p>Update Time:                      </p>
 * <p>Updater:                          </p>
 * <p>Update Comments:                  </p>
 */
public class Child extends Thread{
    @Override
    public void run() {
        System.out.println("Child thread start");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Child thread end");
    }
}
