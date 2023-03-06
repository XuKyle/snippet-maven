package com.kylexu;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println(new App().getInfo());
    }

    public String getInfo() {
        List<Integer> collect = Lists.newArrayList(6, 5, 4, 3, 2, 1)
                .stream()
                .sorted(Comparator.<Integer>naturalOrder())
                .collect(Collectors.toList());
        return Joiner.on(",").join(collect);
    }
}
