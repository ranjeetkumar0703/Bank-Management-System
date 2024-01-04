package com.blog.util_Dec_1st;


import java.util.function.Supplier;

public class MainUtil15_Suppiled {
    public static void main(String[] args) {
        Supplier<MainUtil15_Suppiled>mysupplier=()->new MainUtil15_Suppiled();
        MainUtil15_Suppiled s=mysupplier.get();
        System.out.println(s);
    }
}
