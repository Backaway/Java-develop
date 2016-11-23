package com.backaway.tutorial.jvm.oom;

/**
 * String.intern() 返回引用测试
 * JDK6: false, false JDK7: ture, false
 *
 * Created by Backaway on 16/11/17.
 */
public class RuntimeConstantPooloom2 {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}

