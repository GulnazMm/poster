package ru.netology.poster;

import ru.netology.poster.Manager;

public class Main {
    public void main(String[] args) {

        MovieList first= new MovieList();
        MovieList second = new MovieList();
        MovieList third = new MovieList();
        MovieList fourth = new MovieList();
        MovieList fifth = new MovieList();
        MovieList sixth = new MovieList();
        MovieList seventh = new MovieList();


        Manager manager = new Manager();
        manager.add (first);
        manager.add (second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        MovieList[] all = manager.findAll();
        manager.findLast();

    }


}
