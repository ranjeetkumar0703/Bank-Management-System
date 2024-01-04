package com.blog.util_Dec_1st;

import java.util.function.Function;

public class MainUtil9 {
    public static void main(String[] args) {
        Function<Integer,Double>myfunction=i->i*1.3;
        Double val=myfunction.apply(100);
        System.out.println(val);

    }
}
