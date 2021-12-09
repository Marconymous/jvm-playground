# Streams in Java

[Source Code](Streams.java)

## Streams on Arrays

To get a Stream from an Array use this code

```java
int[] ints = {1, 2, 3, 4};
Arrays.stream(ints);
```

## Streams on Collections

Use the following code to get a Stream from a List

```java
List<String> list = new ArrayList<>();
list.stream();
```

## Mapping a Stream

The map method on a Stream takes a lambda function which has one argument, 
which is of the type of the Stream.
You can return a different type or the same type.

```java
stream.map(s -> s.repeat(2)).collect(Collectors.toList());
```

A common example is mapping a List of Persons to a List of names (Strings):
```java
record Person(String name, String address){}

class Converter {
    public static List<String> personsToName(List<Person> persons) {
        return persons.stream().map(Person::name)
                .collect(Collectors.toList());
    }
}
```

## Reducing a Stream

Reducing a Stream means creating one single value out of all the ones in the Stream.

The reduce method takes either 1 or 2 arguments
- One of the arguments has to be a function with 2 parameters (previously returned value, current value).
- the optional argument is the first one, being the start value
- `reduce(startValue, (prev, current) -> {})`

For Example the following code functions as a sum method:
- Sums all integers in provided in the args

```java
public static int sum(int... ints) {
    return Arrays.stream(ints).reduce(Integer::sum).orElse(0);
}
```

## Foreach on a Stream

There is a forEach method on a Stream, 
which takes one argument with the type `Consumer<? super T>`

The type `Consumer<? super T>` is a function, which takes one argument of type T

In the following Example every String in the Stream is printed:
```java
public static void foreach(String ... str) {
    Arrays.stream(str).forEach(System.out::println);
}
```