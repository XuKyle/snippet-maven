package com.kylexu;

import com.google.common.base.Joiner;

/**
 * Hello world!
 */
public class MavenJarApp {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        String join = Joiner.on(",").join(1, 2, 3, 4, 5);
        System.out.println("join = " + join);
    }
}
