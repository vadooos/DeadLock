package com.vadim;

/**
 * Created by vadim on 07.04.2017.
 */
public class A {
    synchronized void a1(B b){
        System.out.println(Thread.currentThread().getName() + " в a1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        b.b2();
    }

    synchronized void a2(){
        System.out.println("no Deadlock");
    }
}
