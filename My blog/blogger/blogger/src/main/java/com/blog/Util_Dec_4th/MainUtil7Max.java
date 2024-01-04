package com.blog.Util_Dec_4th;

import java.util.Arrays;
import java.util.List;

public class MainUtil7Max {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(100,500,35,600,40,800,20000,1000,5000,200,150);
        Integer val=numbers.stream().max(Integer::compareTo).get();
        System.out.println(val);
    }
}
