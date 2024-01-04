package com.blog.util_Dec_1st;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil13RemovedDuplicateElements {
    public static void main(String[] args) {
        List<Integer>data= Arrays.asList(10,20,20,30,5,6,4,7,7,5,3,6,2);
        List<Integer>newData=data.stream().distinct().collect(Collectors.toList());
        System.out.println(newData);
    }
}
