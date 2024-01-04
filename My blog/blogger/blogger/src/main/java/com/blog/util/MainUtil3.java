package com.blog.util;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil3 {
    public static void main(String[] args) {
        List <Integer>data= Arrays.asList(10,20,40,5,50,100);
        List <Integer> newData=data.stream().filter(x->x>30).collect(Collectors.toList());
        System.out.println(newData);
    }
}
