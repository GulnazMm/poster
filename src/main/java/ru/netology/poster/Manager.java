package ru.netology.poster;



public class Manager {
    private int resultLength = 10;
    private MovieList[] movies = new MovieList[0];

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


    public Manager() {
    }

    public Manager(int resultLength) {
        this.resultLength = resultLength;
    }

    public  MovieList[] findLast(){
        if(resultLength > movies.length){
            resultLength = movies.length;
        }
        MovieList[] result = new MovieList[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = movies.length - i - 1;
            result[i] = movies[index];
        }
        return result;


    }


}

