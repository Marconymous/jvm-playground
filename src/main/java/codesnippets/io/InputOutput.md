# Input and Output in Java

## Output

[Source Code](Output.java)

### Printing to the out Stream

The default out stream is the commandline

- `System.out.println("Hello, World!");` is used to write a full line with a newline at the end
- `System.out.print("Hello,");` writes the given String without a newline
- `System.out.printf("Hello, World! %d", 10);` will print the given String formatted. Without newline

### Printing to the error Stream

If you want to write to the error Stream you need to use `System.err.*`
It supports the same methods as `System.out.*`

## Input

[Source Code](Input.java)

### Reading the commandline

To read the commandline you need to create a Scanner.

```java
Scanner sc = new Scanner(System.in);
```

The Scanner can read different types of input (String, int, float, boolean, etc.), but if the entered value is not able
to be converted to the demanded one an Exception will be thrown.

```java
// Reading a String
var str = sc.nextLine();

// Reading an int
var i = sc.nextInt();

// Reading a boolean
var bool = sc.nextBoolean();
```