package com.backaway.tutorial.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * Java堆溢出
 * VM Args: -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:+HeapDumpOnOutOfMemoryError -XX:SurvivorRatio=8
 *
 * Created by Backaway on 16/11/17.
 */
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
