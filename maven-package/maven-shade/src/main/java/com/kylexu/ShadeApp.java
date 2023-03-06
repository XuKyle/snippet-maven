package com.kylexu;

import com.google.common.base.Splitter;

/**
 * Hello world!
 */
public class ShadeApp {
    public static void main(String[] args) {
        Splitter.on(" ")
                .split("maven shade")
                .forEach(System.out::println);
    }
}
