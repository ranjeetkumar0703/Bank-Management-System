package com.blog.util_Dec_1st;

import java.util.function.Supplier;

public class MainUtil14_Suppiler {
    public static void main(String[] args) {
        Supplier<String>mysupplier=()->"Suppiled value "+56;
        String s=mysupplier.get();
        System.out.println(s);
    }
}
