package com.movietime;
import java.time.LocalTime;

public class ShowTime {
    String movieName;
    LocalTime time;

    public ShowTime(String movieName, LocalTime time) {
        this.movieName = movieName;
        this.time = time;
    }
}
