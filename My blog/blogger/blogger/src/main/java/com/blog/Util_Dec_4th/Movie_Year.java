package com.blog.Util_Dec_4th;

import java.util.Comparator;

public class Movie_Year implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getYear()-o2.getYear();
    }
}
