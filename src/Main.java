import model.Movie;
import model.MyData;
import model.Person;
import model.Radius;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        MyData<String> strData = new MyData<>("string data");
        MyData<Integer> intData = new MyData<>(strData.getData().length());

        Integer[] arrInt = {10, 20, 30, 40};
        int myLength = arrLength(arrInt);

        MyData<Movie[]> movie = new MyData<>(new Movie[]{
                new Movie("spidermane 1", "description spiderman 1",
                        1000, true),
                new Movie("spidermane 2", "description spiderman 2",
                        1000, true)
        });

        // convariant
        MyData<? extends Number> sample1 = new MyData<>(10);
        int intSample1 = sample1.getData().intValue();

        // contravariant
        MyData<Object> objSample2 = new MyData<>("hello world");
        MyData<? super String> sample2 = objSample2;

        // bounded type
        // Radius<String> rdsSample2 = new Radius<String>("7"); ERROR
        Radius<Integer> rdsSample1 = new Radius<>(7);
        double result = Math.PI * rdsSample1.getRadius().doubleValue();


        // wilcard <?> accept any type
        MyData<String> strSample = new MyData<>("hello world");
        MyData<Integer> intSample = new MyData<>(strSample.getData().length());
        WilcardApp.printValue(strSample);
        WilcardApp.printValue(intSample);

        // comparable
        Person[] person = new Person[]{
                new Person("person 1", 10),
                new Person("person 2", 5),
                new Person("person 3", 30)
        };
        Arrays.sort(person);

        // comparator
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        };
        Arrays.sort(person, comparator);
    }

    private static <T> int arrLength (T[] data) {
        return data.length;
    }
}