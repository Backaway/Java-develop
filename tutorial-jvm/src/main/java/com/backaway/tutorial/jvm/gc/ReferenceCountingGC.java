package com.backaway.tutorial.jvm.gc;

/**
 * 引用计数算法的缺陷
 * Created by Backaway on 16/11/18.
 */
public class ReferenceCountingGC {
    public Object instance = null;
    public static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) throws InterruptedException {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
        Thread.sleep(1000);
        System.out.println("End...");
    }
}

