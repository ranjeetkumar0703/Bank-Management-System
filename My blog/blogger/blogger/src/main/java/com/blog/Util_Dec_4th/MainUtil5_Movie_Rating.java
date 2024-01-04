package com.blog.Util_Dec_4th;

import java.util.ArrayList;
import java.util.Collections;

public class MainUtil5_Movie_Rating {
    public static void main(String[] args) {
        Movie m1=new Movie("BBB",9,1999);
        Movie m2=new Movie("ccc",6,2005);
        Movie m3=new Movie("aaa",8,1996);
        ArrayList<Movie>list=new ArrayList<Movie>();
        list.add(m1);
        list.add(m2);
        list.add(m3);

        Movie_Rating movieRating=new Movie_Rating();
        Collections.sort(list,movieRating);
        for (Movie m:list
             ) {
            System.out.println(m.getRating());
            System.out.println(m.getYear());
            System.out.println(m.getName());
        }

    }
}
