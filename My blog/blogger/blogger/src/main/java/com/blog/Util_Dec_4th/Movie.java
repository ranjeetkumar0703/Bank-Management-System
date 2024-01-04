package com.blog.Util_Dec_4th;

public class Movie implements Comparable<Movie> {
    private String name;
    private int rating;
    private int year;

    public Movie(String name, int rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }


    @Override
    public int compareTo(Movie o) {
        return this.year-o.year;
    }
}
