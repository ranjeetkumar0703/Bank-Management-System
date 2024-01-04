package com.blog.util_Dec_1st;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

public class MainUtil10Map {
    public static void main(String[] args) {
        List<Integer> data= Arrays.asList(2,5,10,4,8);
        List<Integer>newData=data.stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(newData);

    }
}
