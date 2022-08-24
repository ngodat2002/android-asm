package com.example.ngochithanhdatasm.event;


import com.example.ngochithanhdatasm.model.Movie;

public class MessageEvent {

    public static class MovieEvent {
        private Movie movie;

        public MovieEvent(Movie movie) {
            this.movie = movie;
        }

        public Movie getMovie() {
            return movie;
        }

        public void setMovie(Movie movie) {
            this.movie = movie;
        }
    }

}
