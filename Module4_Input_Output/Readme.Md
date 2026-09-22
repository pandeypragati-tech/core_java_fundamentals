# Module 4 — Input, Output & Type Conversion

This module covers taking input from the user, displaying output, and converting values from one data type to another in Java.

## Concepts Covered

* Input and Output
* `System.out.print()`
* `System.out.println()`
* Scanner Class
* Integer Input
* Decimal Input
* Character Input
* String Input
* Multiple Inputs
* `next()` vs `nextLine()`
* Type Conversion
* Widening Conversion
* Narrowing Conversion
* Type Casting
* Character and ASCII Values

## Output in Java

Java provides `print()` and `println()` methods for displaying output.

```java
System.out.print("Hello");
System.out.println("Java");
```

`print()` keeps the cursor on the same line, while `println()` moves to the next line.

## Scanner Class

The `Scanner` class is commonly used to take input from the keyboard.

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

Common methods:

```text
nextInt()
nextLong()
nextFloat()
nextDouble()
next()
nextLine()
```

## Type Conversion

Type conversion means converting a value from one data type to another.

### Widening Conversion

A smaller compatible type is automatically converted to a larger compatible type.

```java
int number = 100;
double value = number;
```

### Narrowing Conversion

A larger type is explicitly converted to a smaller type using casting.

```java
double number = 25.75;
int value = (int) number;
```

The fractional part is removed during this conversion.

## Character and ASCII

Characters can be converted to their numeric codes.

```java
char ch = 'A';
int code = ch;
```

For standard ASCII, `A` has the value `65`.

## Important Note

Java `char` is a 16-bit UTF-16 code unit. ASCII is only a subset of the characters represented by Java `char`.

## Programs

| File                       | Concept                   |
| -------------------------- | ------------------------- |
| `PrintDemo.java`           | `print()` and `println()` |
| `ScannerInput.java`        | Basic Scanner usage       |
| `IntegerInput.java`        | Integer input             |
| `DoubleInput.java`         | Decimal input             |
| `CharacterInput.java`      | Character input           |
| `StringInput.java`         | String input              |
| `MultipleInputs.java`      | Multiple values           |
| `NextVsNextLine.java`      | `next()` and `nextLine()` |
| `AddTwoNumbers.java`       | Input and calculation     |
| `StudentDetails.java`      | Multiple types of input   |
| `WideningConversion.java`  | Automatic conversion      |
| `NarrowingConversion.java` | Explicit narrowing        |
| `TypeCasting.java`         | Type casting              |
| `CharacterToASCII.java`    | Character to numeric code |

## Learning Outcome

After completing this module, you should be able to:

* Display output using Java output methods.
* Take different types of input using `Scanner`.
* Understand the difference between `next()` and `nextLine()`.
* Take multiple inputs from the user.
* Perform arithmetic operations on input values.
* Understand widening and narrowing conversion.
* Perform explicit type casting.
* Convert characters to their numeric codes.
