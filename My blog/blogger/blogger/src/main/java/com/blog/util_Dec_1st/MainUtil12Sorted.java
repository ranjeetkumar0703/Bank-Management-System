package com.blog.util_Dec_1st;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil12Sorted {
    public static void main(String[] args) {
        List<String>data= Arrays.asList("mike","adam","raja","xyz","abc","stallin","michel","baba");
        List<String>newData=data.stream().sorted().collect(Collectors.toList());
        System.out.println(newData);
    }
}
