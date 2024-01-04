package com.blog.util_Dec_1st;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil2 {
    public static void main(String[] args) {

        List<String >data= Arrays.asList("mike","smith","adam","michel","stallin","mithun","raj");
        List<String>newData=data.stream().filter(x->x.endsWith("n")).collect(Collectors.toList());
        System.out.println(newData);
    }
}
