package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
public class B {
    synchronized void b1(A a){
        System.out.println(Thread.currentThread().getName() + " в b1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.a2();
    }

    synchronized void b2(){
        System.out.println("no Deadlock");
    }
}
