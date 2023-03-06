package com.kylexu;

import com.google.common.base.Splitter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Splitter.on(" ")
                .split("hello maven")
                .forEach(System.out::println);
    }

    public static void print() {
        Splitter.on(" ")
                .split("hello maven")
                .forEach(System.out::println);
    }
}
