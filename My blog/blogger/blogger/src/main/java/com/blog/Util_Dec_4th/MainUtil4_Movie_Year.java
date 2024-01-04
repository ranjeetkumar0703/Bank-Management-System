package com.blog.Util_Dec_4th;

import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;

public class MainUtil4_Movie_Year {
    public static void main(String[] args) {

        Movie m1=new Movie("aaa",9,2000);
        Movie m2=new Movie("ccc",7,1995);
        Movie m3=new Movie("bbb",8,1999);
        ArrayList<Movie>list=new ArrayList<Movie>();
        list.add(m1);
        list.add(m2);
        list.add(m3);

        Movie_Year movieYear=new Movie_Year();
        Collections.sort(list,movieYear);
        for (Movie m:list
             ) {

            System.out.println(m.getName());
            System.out.println(m.getRating());
            System.out.println(m.getYear());

        }
    }

}
