package com.blog.util_Dec_5th;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainUtil1_Emp {
    public static void main(String[] args) {

        List<Employee>data= Arrays.asList(

                new Employee("mike",5000),
                new Employee("Stallin",10000),
                new Employee("adam",5000));
        Map<Double, List<Employee>> group = data.stream().collect(Collectors.groupingBy(Employee::getSalary));
        System.out.println(group);
    }
}
