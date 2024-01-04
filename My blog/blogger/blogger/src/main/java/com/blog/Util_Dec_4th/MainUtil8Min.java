package com.blog.Util_Dec_4th;

import java.util.Arrays;
import java.util.List;

public class MainUtil8Min {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(100,2000,400,40,50,20,30000);

        Integer Maxval=numbers.stream().max(Integer::compareTo).get();
        System.out.println(Maxval);
        Integer Minval=numbers.stream().min(Integer::compareTo).get();
        System.out.println(Minval);
    }
}
