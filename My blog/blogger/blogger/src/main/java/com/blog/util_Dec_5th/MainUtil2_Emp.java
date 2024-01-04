package com.blog.util_Dec_5th;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainUtil2_Emp {
    public static void main(String[] args) {
        List<Employee>data= Arrays.asList(new Employee("mike",5000),new Employee("stallin",10000),
                new Employee("adam",5000));
        Map<Double, List<Employee>>groups = data.stream().collect(Collectors.groupingBy(Employee::getSalary));
        for (Map.Entry<Double,List<Employee>> entry:groups.entrySet()) {

            double salary= entry.getKey();
            List<Employee>employeeList=entry.getValue();
            System.out.println("Emplyees with salary "+salary+":");
            for (Employee emp:employeeList) {
                System.out.println("\t"+emp.getName());

            }

        }


    }
}
