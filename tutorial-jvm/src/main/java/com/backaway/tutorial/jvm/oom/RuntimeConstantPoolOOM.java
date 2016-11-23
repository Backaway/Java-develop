package com.backaway.tutorial.jvm.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * 运行时常量池导致的内存溢出异常, Run with JDK6
 * VM Args: -XX:PermSize=10M -XX:MaxPermSize=10M
 *
 * Created by Backaway on 16/11/17.
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
