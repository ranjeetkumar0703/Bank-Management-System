package com.blog.util_Dec_1st;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil1 {
    public static void main(String[] args) {
        List<String>data= Arrays.asList("mike","stallin","mithun","adam","smith","michel");
        List<String>newData=data.stream().filter(x->x.startsWith("s")).collect(Collectors.toList());
        System.out.println(newData);
    }
}
