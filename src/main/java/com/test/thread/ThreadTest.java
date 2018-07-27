package com.test.thread;

/**
 * @author zhuyoulong
 * @date 2018年-07月-27日
 * <p>Update Time:                      </p>
 * <p>Updater:                          </p>
 * <p>Update Comments:                  </p>
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread =  new Thread(new Parent());
        thread.start();
    }
}
