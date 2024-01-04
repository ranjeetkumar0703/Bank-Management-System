package com.blog.util_Dec_1st;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil11Sorted {
    public static void main(String[] args) {
        List<Integer>data= Arrays.asList(4,6,23,56,12,3,56,90,20);
        List<Integer>newData=data.stream().sorted().collect(Collectors.toList());
        System.out.println(newData);
    }
}
