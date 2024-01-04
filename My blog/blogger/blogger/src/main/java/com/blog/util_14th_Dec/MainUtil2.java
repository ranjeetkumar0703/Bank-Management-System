package com.blog.util_14th_Dec;

public class MainUtil2 {
    public static void main(String[] args) {
        new MainUtil2().test().test2();
    }
    public MainUtil2 test(){
      return new MainUtil2();
    }
    public void test2(){
        System.out.println(400);
    }
}
