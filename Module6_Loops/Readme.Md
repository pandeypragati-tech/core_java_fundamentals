# Module 6 — Loops

This module covers loops in Java, loop-control statements, number-based problems, and pattern programs.

Loops are one of the most important concepts in programming because they allow a block of code to execute repeatedly without writing the same code multiple times.

---

# 1. What is a Loop?

A **loop** is a control structure used to execute a block of statements repeatedly as long as a specified condition is satisfied.

### Example

```java
for (int i = 1; i <= 5; i++)
{
    System.out.println(i);
}
```

Output:

```text
1
2
3
4
5
```

---

# 2. Types of Loops in Java

Java provides three main types of loops:

1. `while` loop
2. `do-while` loop
3. `for` loop

---

# 3. while Loop

The `while` loop is used when a block of code needs to be executed repeatedly while a condition is true.

### Syntax

```java
while (condition)
{
    // statements
}
```

### Important Point

The condition is checked **before** the execution of the loop body.

Therefore, the loop may execute **zero times**.

### Example

```java
int i = 1;

while (i <= 5)
{
    System.out.println(i);
    i++;
}
```

---

# 4. do-while Loop

The `do-while` loop executes the statements first and checks the condition afterward.

### Syntax

```java
do
{
    // statements
}
while (condition);
```

### Important Point

A `do-while` loop executes **at least once**, even if the condition is false initially.

### Example

```java
int i = 1;

do
{
    System.out.println(i);
    i++;
}
while (i <= 5);
```

---

# 5. for Loop

The `for` loop is generally used when the number of iterations is known.

### Syntax

```java
for (initialization; condition; update)
{
    // statements
}
```

It contains three parts:

* Initialization
* Condition
* Update

### Example

```java
for (int i = 1; i <= 5; i++)
{
    System.out.println(i);
}
```

---

# 6. Nested Loop

A loop inside another loop is called a **nested loop**.

### Example

```java
for (int i = 1; i <= 3; i++)
{
    for (int j = 1; j <= 3; j++)
    {
        System.out.print("* ");
    }

    System.out.println();
}
```

Nested loops are commonly used for:

* Pattern printing
* Tables
* Matrix operations
* Pythagorean triplets
* Comparing multiple values

---

# 7. break Statement

The `break` statement immediately terminates the loop.

### Example

```java
for (int i = 1; i <= 10; i++)
{
    if (i == 5)
    {
        break;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
3
4
```

---

# 8. continue Statement

The `continue` statement skips the current iteration and moves to the next iteration.

### Example

```java
for (int i = 1; i <= 5; i++)
{
    if (i == 3)
    {
        continue;
    }

    System.out.println(i);
}
```

Output:

```text
1
2
4
5
```

---

# 9. Loop Comparison

| Loop     | Condition Check | Minimum Execution | Common Use                  |
| -------- | --------------- | ----------------- | --------------------------- |
| while    | Before body     | 0 times           | Condition-based repetition  |
| do-while | After body      | 1 time            | Menu/input-based repetition |
| for      | Before body     | 0 times           | Known number of iterations  |

---

# 10. Important Number Concepts

## Sum of Digits

For a number `1234`:

```text
1 + 2 + 3 + 4 = 10
```

The last digit can be obtained using:

```java
digit = number % 10;
```

The last digit can be removed using:

```java
number = number / 10;
```

---

## Reverse of a Number

For:

```text
1234
```

Reverse:

```text
4321
```

Basic logic:

```java
digit = number % 10;
reverse = reverse * 10 + digit;
number = number / 10;
```

---

# 11. Palindrome Number

A number is a palindrome when its reverse is equal to the original number.

Examples:

```text
121 → Palindrome
1331 → Palindrome
123 → Not Palindrome
```

---

# 12. Factorial

The factorial of a positive integer `n` is the product of all positive integers from `1` to `n`.

```text
5! = 5 × 4 × 3 × 2 × 1
   = 120
```

Also:

```text
0! = 1
```

---

# 13. Fibonacci Series

The Fibonacci series is a sequence in which every number is obtained by adding the previous two numbers.

Example:

```text
0 1 1 2 3 5 8 13 21 ...
```

Formula:

```text
next = first + second
```

---

# 14. Prime Number

A prime number is a number greater than `1` that has exactly two factors:

```text
1 and itself
```

Examples:

```text
2, 3, 5, 7, 11, 13, 17...
```

Important:

```text
0 → Not Prime
1 → Not Prime
2 → Prime
```

---

# 15. Armstrong Number

For a three-digit number, if the sum of the cubes of its digits is equal to the original number, it is an Armstrong number.

Example:

```text
153

1³ + 5³ + 3³
= 1 + 125 + 27
= 153
```

Therefore, `153` is an Armstrong number.

---

# 16. Perfect Number

A number is called a perfect number if the sum of its proper divisors is equal to the number itself.

Example:

```text
28

Factors:
1, 2, 4, 7, 14

1 + 2 + 4 + 7 + 14 = 28
```

Therefore, `28` is a perfect number.

---

# 17. Pythagorean Triplets

Three positive integers `a`, `b`, and `c` are called a Pythagorean triplet if:

```text
a² + b² = c²
```

Example:

```text
3, 4, 5

3² + 4² = 5²
9 + 16 = 25
```

---

# 18. Patterns and Nested Loops

Patterns are generally created using nested loops.

Example:

```text
*
* *
* * *
* * * *
* * * * *
```

The outer loop controls the rows.

The inner loop controls the elements printed in each row.

---

# Important Loop Logic

### `while`

```text
Initialization
     ↓
Condition
     ↓
Loop Body
     ↓
Update
     ↓
Condition
```

### `for`

```text
Initialization
     ↓
Condition
     ↓
Loop Body
     ↓
Update
     ↓
Condition
```

### `do-while`

```text
Loop Body
     ↓
Update
     ↓
Condition
     ↓
Repeat / Stop
```

---

# Files in This Module

### Basic Loop Programs

* `WhileLoop.java`
* `DoWhileLoop.java`
* `ForLoop.java`
* `NestedLoop.java`
* `BreakStatement.java`
* `ContinueStatement.java`

### Number Programs

* `SumOfNumbers.java`
* `SumOfDigits.java`
* `ReverseNumber.java`
* `PalindromeNumber.java`
* `Factorial.java`
* `FibonacciSeries.java`
* `PrimeNumber.java`
* `PrimeNumbersInRange.java`
* `ArmstrongNumber.java`
* `ArmstrongNumbersInRange.java`
* `PerfectNumber.java`
* `PythagoreanTriplets.java`
* `MultiplicationTable.java`

### Pattern Programs

* `FilledRectangle.java`
* `RightTrianglePattern.java`
* `NumberPattern.java`
* `CharacterPattern.java`

---

# Learning Outcomes

After completing this module, you should be able to:

* Understand all three types of loops.
* Choose the appropriate loop for a problem.
* Use nested loops.
* Use `break` and `continue`.
* Calculate factorials.
* Generate Fibonacci series.
* Check prime numbers.
* Generate prime numbers in a range.
* Check palindrome numbers.
* Reverse numbers.
* Calculate the sum of digits.
* Check Armstrong numbers.
* Check perfect numbers.
* Find Pythagorean triplets.
* Create patterns using nested loops.

---

# Quick Revision

| Concept     | Key Idea                           |
| ----------- | ---------------------------------- |
| `while`     | Condition checked before execution |
| `do-while`  | Executes at least once             |
| `for`       | Best when iterations are known     |
| Nested loop | Loop inside another loop           |
| `break`     | Terminates the loop                |
| `continue`  | Skips current iteration            |
| Factorial   | Product from `1` to `n`            |
| Fibonacci   | Next = previous two numbers sum    |
| Prime       | Exactly two factors                |
| Palindrome  | Original = Reverse                 |
| Armstrong   | Digit powers sum = Original        |
| Perfect     | Sum of proper divisors = Number    |
| Pattern     | Usually uses nested loops          |

---

## Practice Order

For effective learning, practice the programs in this order:

1. `WhileLoop`
2. `DoWhileLoop`
3. `ForLoop`
4. `NestedLoop`
5. `BreakStatement`
6. `ContinueStatement`
7. `SumOfNumbers`
8. `SumOfDigits`
9. `ReverseNumber`
10. `PalindromeNumber`
11. `Factorial`
12. `FibonacciSeries`
13. `PrimeNumber`
14. `PrimeNumbersInRange`
15. `ArmstrongNumber`
16. `ArmstrongNumbersInRange`
17. `PerfectNumber`
18. `PythagoreanTriplets`
19. `MultiplicationTable`
20. Pattern programs

This order moves from basic loop syntax to logic-building and finally to nested-loop patterns.
