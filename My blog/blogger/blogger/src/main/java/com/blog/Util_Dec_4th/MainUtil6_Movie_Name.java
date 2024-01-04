package com.blog.Util_Dec_4th;

import java.util.ArrayList;
import java.util.Collections;

public class MainUtil6_Movie_Name {
    public static void main(String[] args) {
        Movie m1=new Movie("bbb",9,2000);
        Movie m2=new Movie("ccc",6,2008);
        Movie m3=new Movie("aaa",9,2016);

        ArrayList<Movie>list=new ArrayList<Movie>();
        list.add(m1);
        list.add(m2);
        list.add(m3);

        Movie_Name movieName=new Movie_Name();
        Collections.sort(list,movieName);
        for (Movie m:list
             ) {
            System.out.println(m.getName());
            System.out.println(m.getYear());
            System.out.println(m.getRating());
        }
    }
}
