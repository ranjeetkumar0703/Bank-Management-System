package com.blog.util_Dec_1st;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainUtil4Emp {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.setName("mike");
        emp1.setCity("bpl");
        emp1.setSalary(60000);
        Employee emp2=new Employee();
        emp2.setName("aadi");
        emp2.setCity("bengaluru");
        emp2.setSalary(80000);

        Employee emp3=new Employee();
        emp3.setName("vikash");
        emp3.setCity("hydrabad");
        emp3.setSalary(50000);

        Employee emp4=new Employee();
        emp4.setName("rehan");
        emp4.setCity("indore");
        emp4.setSalary(25000);

        List<Employee>data= Arrays.asList(emp1,emp2,emp3,emp4);
        List<Employee>newData=data.stream().filter(e->e.getSalary()==50000).collect(Collectors.toList());
        System.out.println(newData);

    }
}
