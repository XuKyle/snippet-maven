package com.kylexu;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class AppB {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public String getInfo() {
        ArrayList<Integer> list = Lists.newArrayList(6, 5, 4, 3, 2, 1);
        return Joiner.on(",").join(list);
    }
}
