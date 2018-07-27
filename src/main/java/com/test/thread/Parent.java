package com.test.thread;

/**
 * @author zhuyoulong
 * @date 2018年-07月-27日
 * <p>Update Time:                      </p>
 * <p>Updater:                          </p>
 * <p>Update Comments:                  </p>
 */
public class Parent extends Thread {

    /**
     * 让父线程等待子线程结束之后才能继续运行。
     *
     * 上面代码展示了两个类：Parent（父线程类），Child（子线程类）。
     *
     * 在 Parent.run() 中，通过 Child child = new Child(); 新建 child 子线程（此时 child 处于 NEW 状态）；
     *
     * 然后再调用 child.start()（child 转换为 RUNNABLE 状态）；
     *
     * 再调用 child.join()。
     *
     * 在 Parent 调用 child.join() 后，child 子线程正常运行，Parent 父线程会等待 child 子线程结束后再继续运行。
     */
    @Override
    public void run() {
        System.out.println("Thread start");
        Child child = new Child();
        child.start();
        try {
            child.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Parent Thread end");
    }
}
