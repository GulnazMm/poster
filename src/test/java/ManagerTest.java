import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.poster.Manager;
import ru.netology.poster.MovieList;


public class ManagerTest {
    MovieList first = new MovieList();
    MovieList second = new MovieList();
    MovieList third = new MovieList();
    MovieList fourth = new MovieList();
    MovieList fifth = new MovieList();
    MovieList sixth = new MovieList();
    MovieList seventh = new MovieList();

    Manager manager = new Manager();

    @Test
    public void addTest() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);

        MovieList[] actual = manager.findAll();
        MovieList[] expected = {first, second, third, fourth, fifth, sixth, seventh};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void addSecondMovie() {

        manager.add(second);


        MovieList[] actual = manager.findAll();
        MovieList[] expected = {second};
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLastTest() {

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);


        MovieList[] actual = manager.findLast();
        MovieList[] expected = {seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);

    }


    @Test
    public void findLast() {
        manager.add(first);
        manager.add(second);


        MovieList[] actual = manager.findLast();
        MovieList[] expected = {second, first};
        Assertions.assertArrayEquals(expected, actual);

    }
}
