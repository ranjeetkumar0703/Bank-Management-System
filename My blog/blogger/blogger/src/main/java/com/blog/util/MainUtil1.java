package com.blog.util;

import java.util.function.Predicate;

public class MainUtil1 {
    public static void main(String[] args) {
        Predicate<Integer>condition=y->y>1000;
        boolean val=condition.test(100);
        System.out.println(val);
    }
}
