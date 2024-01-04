package com.blog.Util_Dec_4th;

import java.util.ArrayList;

import java.util.Collections;

public class MainUtil3_Movie {

    public static void main(String[] args) {

     Movie m1=new Movie("bbb",8,1999);
     Movie m2=new Movie("aaa",6,1986);
     Movie m3=new Movie("ccc",9,2000);


        ArrayList<Movie>list=new ArrayList<Movie>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        Collections.sort(list);
        for (Movie m:list
             ) {
            System.out.println(m.getName());
            System.out.println(m.getYear());
            System.out.println(m.getRating());

        }


    }
}
