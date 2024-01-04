package com.blog.Util_Dec_4th;

import java.util.Arrays;
import java.util.List;

public class MainUtil9_Emp {
    public static void main(String[] args) {
        List<Employee>names= Arrays.asList(new Employee(2,"xyz"),new Employee(1,"abc"));
        Employee Maxemp = names.stream().max(Employee::compareTo).get();

        System.out.println("Maximum employee");
        System.out.println(Maxemp.getId());
        System.out.println(Maxemp.getName());

        Employee Minemp = names.stream().min(Employee::compareTo).get();

        System.out.println("Minimum employee");
        System.out.println(Minemp.getId());
        System.out.println(Minemp.getName());


    }
}
