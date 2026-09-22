# Module 5 — Decision Making

This module covers decision-making statements in Java. These statements allow a program to execute different blocks of code depending on whether a condition is true or false.

## Concepts Covered

* `if` statement
* `if-else` statement
* Nested `if`
* `else-if` ladder
* `switch` statement
* `break` in switch
* `default` case
* Menu-driven programs
* Conditional problem solving

## 1. if Statement

The `if` statement executes a block of code only when a specified condition is true.

```java
if (condition)
{
    // statements
}
```

## 2. if-else Statement

The `if-else` statement provides two possible execution paths.

```java
if (condition)
{
    // if condition is true
}
else
{
    // if condition is false
}
```

## 3. Nested if

A nested `if` is an `if` statement placed inside another `if` statement.

```java
if (condition1)
{
    if (condition2)
    {
        // statements
    }
}
```

## 4. else-if Ladder

An `else-if` ladder is used when multiple conditions need to be checked.

```java
if (condition1)
{
    // statements
}
else if (condition2)
{
    // statements
}
else
{
    // statements
}
```

Conditions are checked from top to bottom. Once a true condition is found, its block is executed.

## 5. switch Statement

The `switch` statement is used to select one block from multiple fixed choices.

```java
switch (expression)
{
    case value1:
        // statements
        break;

    case value2:
        // statements
        break;

    default:
        // statements
}
```

### Important Points

* `break` exits the switch statement.
* Without `break`, execution can continue into the following cases.
* `default` executes when no case matches.
* `switch` is useful for fixed choices.
* `if-else` is generally more suitable for ranges and complex conditions.

## Programs

| File                        | Concept                |
| --------------------------- | ---------------------- |
| `IfStatement.java`          | Basic `if`             |
| `IfElseStatement.java`      | `if-else`              |
| `NestedIf.java`             | Nested conditions      |
| `ElseIfLadder.java`         | Multiple conditions    |
| `SwitchStatement.java`      | `switch-case`          |
| `EvenOdd.java`              | Even/odd               |
| `PositiveNegativeZero.java` | Number classification  |
| `LargestOfTwo.java`         | Compare two numbers    |
| `LargestOfThree.java`       | Compare three numbers  |
| `SmallestOfThree.java`      | Find smallest number   |
| `DivisibleByFive.java`      | Divisibility           |
| `LeapYear.java`             | Leap year condition    |
| `VowelConsonant.java`       | Character checking     |
| `AlphabetCheck.java`        | Alphabet validation    |
| `GradeCalculator.java`      | Grade calculation      |
| `DayOfWeek.java`            | Switch-based selection |
| `MonthName.java`            | Switch-based selection |
| `MenuDrivenCalculator.java` | Menu-driven program    |

## Learning Outcome

After completing this module, you should be able to:

* Use conditional statements in Java.
* Write nested conditions.
* Use an `else-if` ladder for multiple conditions.
* Use `switch-case` for fixed choices.
* Build menu-driven programs.
* Solve common conditional programming problems.
