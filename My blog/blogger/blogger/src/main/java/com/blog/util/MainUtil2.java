package com.blog.util;

import javax.persistence.criteria.CriteriaBuilder;

import java.util.function.Predicate;


public class MainUtil2 {
    public static void main(String[] args) {
        Predicate<String>condition=y->y.equals("mike");
        boolean val=condition.test("mike");
        System.out.println(val);
    }
}
