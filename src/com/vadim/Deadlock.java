package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
public class Deadlock implements Runnable{
    A objA = new A();
    B objB = new B();


    public Deadlock() {
        Thread.currentThread().setName("thread1");
        Thread t = new Thread(this, "thread2");
        t.start();

        objA.a1(objB);
    }

    @Override
    public void run() {
        objB.b1(objA);
    }


}
