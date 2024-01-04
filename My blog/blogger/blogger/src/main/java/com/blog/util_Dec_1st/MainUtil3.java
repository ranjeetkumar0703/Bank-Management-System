package com.blog.util_Dec_1st;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil3 {
    public static void main(String[] args) {
        List<String>data= Arrays.asList("sumit","ram","samir","mira","michel","adam","stallin","mithun","aadi","mike");
        List<String>newData=data.stream().filter(x->x.equals("mike")).collect(Collectors.toList());
        System.out.println(newData);
    }
}
