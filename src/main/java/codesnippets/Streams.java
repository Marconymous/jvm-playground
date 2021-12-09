package codesnippets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    static String[] str = {"Java", "is", "a", "JVM-Based", "Language"};

    public static Stream<String> arrayStream() {
        return Arrays.stream(str);
    }

    public static Stream<String> listStream() {
        return new ArrayList<>(Arrays.asList(str)).stream();
    }

    public static List<String> mapList() {
        return arrayStream().map(s -> s.repeat(2)).collect(Collectors.toList());
    }

    public List<String> personsToName(List<Person> persons) {
        return persons.stream().map(Person::name).collect(Collectors.toList());
    }

    public static int sum(int... ints) {
        return Arrays.stream(ints).reduce(Integer::sum).orElse(0);
    }

    public static void foreach(String ... str) {
        Arrays.stream(str).forEach(System.out::println);
    }

    public static void main(String[] args) {
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sum(ints));
    }
}

record Person(String name, String address) {
}


