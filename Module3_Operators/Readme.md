# Module 4 — Operators & Expressions

This module covers Java operators and expressions used to perform calculations, comparisons, logical operations, assignments, and other programming operations.

## Concepts Covered

* Operators and Operands
* Arithmetic Operators
* Relational Operators
* Logical Operators
* Assignment Operators
* Unary Operators
* Increment and Decrement Operators
* Ternary Operator
* Bitwise Operators
* Expressions
* Operator Precedence
* Operator Associativity

## Types of Operators

### 1. Arithmetic Operators

Used to perform mathematical operations.

```text
+    Addition
-    Subtraction
*    Multiplication
/    Division
%    Modulus
```

### 2. Relational Operators

Used to compare two values.

```text
>     Greater than
<     Less than
>=    Greater than or equal to
<=    Less than or equal to
==    Equal to
!=    Not equal to
```

The result of a relational operation is a boolean value: `true` or `false`.

### 3. Logical Operators

Used to combine or reverse boolean conditions.

```text
&&    Logical AND
||    Logical OR
!     Logical NOT
```

### 4. Assignment Operators

Used to assign or update values.

```text
=     Assignment
+=    Add and assign
-=    Subtract and assign
*=    Multiply and assign
/=    Divide and assign
%=    Modulus and assign
```

### 5. Unary Operators

Operate on a single operand.

```text
+     Unary plus
-     Unary minus
++    Increment
--    Decrement
!     Logical NOT
```

### 6. Ternary Operator

The ternary operator is a short form of `if-else`.

```java
condition ? value1 : value2;
```

### 7. Bitwise Operators

Used to perform operations at the bit level.

```text
&     AND
|     OR
^     XOR
~     Complement
<<    Left shift
>>    Right shift
>>>   Unsigned right shift
```

## Expressions

An expression is a combination of values, variables, operators, and method calls that produces a value.

Example:

```java
int result = a + b * 2;
```

## Operator Precedence

Java evaluates operators according to their precedence.

A simplified order is:

```text
1. Parentheses              ()
2. Unary                    ++ -- ! + -
3. Multiplication           * / %
4. Addition                 + -
5. Relational               < > <= >=
6. Equality                 == !=
7. Logical AND              &&
8. Logical OR               ||
9. Ternary                  ?:
10. Assignment              = += -= *= /= %=
```

Parentheses can be used to make the intended order explicit.

## Programs

| File                       | Concept                          |
| -------------------------- | -------------------------------- |
| `ArithmeticOperators.java` | Arithmetic operators             |
| `RelationalOperators.java` | Relational operators             |
| `LogicalOperators.java`    | Logical operators                |
| `AssignmentOperators.java` | Assignment operators             |
| `UnaryOperators.java`      | Unary operators                  |
| `IncrementDecrement.java`  | Pre/post increment and decrement |
| `TernaryOperator.java`     | Ternary operator                 |
| `BitwiseOperators.java`    | Bitwise operators                |
| `OperatorPrecedence.java`  | Precedence and expressions       |
| `SimpleCalculator.java`    | Arithmetic operations            |
| `EvenOdd.java`             | Modulus operator                 |
| `PositiveNegative.java`    | Relational operators             |
| `LargestOfTwo.java`        | Comparison operators             |

## Learning Outcome

After completing this module, you should be able to:

* Identify different types of Java operators.
* Perform arithmetic calculations.
* Compare values using relational operators.
* Combine conditions using logical operators.
* Use assignment and unary operators.
* Understand pre-increment and post-increment.
* Use the ternary operator.
* Perform basic bitwise operations.
* Understand expressions, precedence, and associativity.
* Apply operators to solve basic programming problems.
