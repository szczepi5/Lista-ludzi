package com.sdajava.Ludzie;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Person> personlist = Arrays.asList(
                        new Person("Pawel", "Lubaszenko"),
                        new Person("Gawel", "Szenkolub"),
                        new Person("Szaweł", "Gubaszenko"));


        personlist.sort((p1, p2) -> p1.name.compareTo(p2.name));
        personlist.forEach(s -> System.out.println("Imie: " + s.name));



        Stream.of(1,2,3,4,5,6)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
