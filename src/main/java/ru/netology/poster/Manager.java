package ru.netology.poster;


public class Manager {
    private int resultLength;
    private MovieList[] movies = new MovieList[0];

    public Manager() {
        resultLength = 10;
    }

    public Manager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void add(MovieList movie) {
        int length = movies.length + 1;
        MovieList[] x = new MovieList[length];
        System.arraycopy(movies, 0, x, 0, movies.length);
        int lastIndex = x.length - 1;
        x[lastIndex] = movie;
        movies = x;
    }

    public MovieList[] findAll() {
        return movies;
    }


    public MovieList[] findLast() {
        MovieList[] result;
        if (resultLength < movies.length) {
            result = new MovieList[resultLength];
        } else {
            result = new MovieList[movies.length];
        }
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;
    }

}

