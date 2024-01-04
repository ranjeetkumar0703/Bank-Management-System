package com.blog.util_Dec_1st;

import java.util.function.Function;

public class MainUtil8 {
    public static void main(String[] args) {
        Function<Integer,String> myfunction= i->"Result: "+i;
        String val=myfunction.apply(100);
        System.out.println(val);
    }
}
