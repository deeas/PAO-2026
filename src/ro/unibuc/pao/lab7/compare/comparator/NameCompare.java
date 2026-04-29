package ro.unibuc.pao.lab7.compare.comparator;

import ro.unibuc.pao.lab7.compare.comparable.Movie;

import java.util.Comparator;

public class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return movie1.getName().compareTo(movie2.getName());
    }
}
