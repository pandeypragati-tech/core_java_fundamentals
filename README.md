# Core Java Fundamentals

A structured collection of Core Java programs covering Java fundamentals, environment setup, operators, input/output, decision making, loops, methods, arrays, strings, and beginner-level console projects.

This repository is designed to build a strong foundation in Java programming and problem-solving through structured practice.

---

## 📌 Repository Overview

The repository follows a module-wise learning approach, starting from Java basics and gradually moving toward problem-solving and mini projects.

```text
Core Java Fundamentals
        ↓
Java Basics
        ↓
Java Environment
        ↓
Operators
        ↓
Input / Output
        ↓
Decision Making
        ↓
Loops
        ↓
Methods
        ↓
Arrays
        ↓
Strings
        ↓
Mini Projects
```

---

## 📚 Modules

| Module | Topic            | Main Focus                                                                        |
| ------ | ---------------- | --------------------------------------------------------------------------------- |
| 01     | Java Basics      | Variables, constants, data types, literals and type casting                       |
| 02     | Java Environment | JDK, JRE, JVM, compilation, execution, algorithms and flowcharts                  |
| 03     | Operators        | Arithmetic, relational, logical, assignment, unary, ternary and bitwise operators |
| 04     | Input / Output   | Scanner, user input, output, type conversion and characters                       |
| 05    | Decision Making  | if, if-else, nested if, else-if ladder and switch                                 |
| 06     | Loops            | while, do-while, for, nested loops, break, continue and patterns                  |
| 07     | Methods          | Methods, parameters, return values, overloading and recursion                     |
| 08     | Arrays           | One-dimensional arrays, searching, sorting, 2D arrays and matrices                |
| 09    | Strings          | String handling, methods, comparison, searching and character operations          |
| 10     | Mini Projects    | Beginner console applications combining Core Java concepts                        |

---

# 01 — Java Basics

### Topics Covered

* Introduction to Java
* First Java program
* Variables
* Constants
* Primitive data types
* Literals
* Type casting
* Widening conversion
* Narrowing conversion

### Important Concepts

A **variable** is a named memory location used to store a value.

A **constant** is a value that cannot be changed after initialization. Java uses the `final` keyword for constants.

### Primitive Data Types

```text
byte
short
int
long
float
double
char
boolean
```

### Type Casting

Type casting means converting a value from one data type to another.

```java
int number = 100;
double value = number;
```

This is widening conversion.

```java
double value = 25.75;
int number = (int) value;
```

This is narrowing conversion.

---

# 02 — Java Environment

### Topics Covered

* JDK
* JRE
* JVM
* Java compilation
* Bytecode
* Program structure
* `main()` method
* Algorithm
* Flowchart

### JDK, JRE and JVM

```text
JDK → Develop Java applications
JRE → Run Java applications
JVM → Execute Java bytecode
```

Relationship:

```text
JDK
 └── JRE
      └── JVM
```

### Java Execution Process

```text
.java Source File
       ↓
      javac
       ↓
   Bytecode
       ↓
    .class
       ↓
      JVM
       ↓
     Output
```

### Algorithm

An algorithm is a finite sequence of clear and well-defined steps used to solve a particular problem.

### Flowchart

A flowchart is a graphical representation of an algorithm using standard symbols and arrows to show the flow of a solution.

### Common Flowchart Symbols

| Symbol        | Purpose        |
| ------------- | -------------- |
| Oval          | Start / Stop   |
| Parallelogram | Input / Output |
| Rectangle     | Process        |
| Diamond       | Decision       |
| Arrow         | Flow           |

---

# 03 — Operators

### Topics Covered

* Operators and operands
* Arithmetic operators
* Relational operators
* Logical operators
* Assignment operators
* Unary operators
* Increment and decrement
* Ternary operator
* Bitwise operators
* Expressions
* Operator precedence

### Arithmetic Operators

```text
+   Addition
-   Subtraction
*   Multiplication
/   Division
%   Remainder
```

### Relational Operators

```text
>   <   >=   <=   ==   !=
```

### Logical Operators

```text
&&   Logical AND
||   Logical OR
!    Logical NOT
```

### Assignment Operators

```text
=   +=   -=   *=   /=   %=
```

### Unary Operators

```text
+   -   ++   --   !
```

### Ternary Operator

```java
condition ? value1 : value2;
```

### Bitwise Operators

```text
&   |   ^   ~   <<   >>   >>>
```

### Simplified Operator Precedence

```text
()
Unary
* / %
+ -
Relational
Equality
&&
||
?:
Assignment
```

---

# 04 — Input / Output

### Topics Covered

* `print()`
* `println()`
* Scanner
* Integer input
* Double input
* Character input
* String input
* Multiple inputs
* `next()` and `nextLine()`
* Type casting
* Widening conversion
* Narrowing conversion
* Character and ASCII values

### Scanner

The `Scanner` class is commonly used to take input from the user.

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

### `next()` vs `nextLine()`

```text
next()      → reads one word
nextLine()  → reads a complete line
```

### Character and ASCII

Java `char` is a 16-bit UTF-16 code unit. Standard ASCII represents characters from `0` to `127`.

---

# 05 — Decision Making

### Topics Covered

* `if`
* `if-else`
* Nested `if`
* `else-if` ladder
* `switch`
* `break`
* `default`
* Menu-driven programs

### if

Used when code should execute only when a condition is true.

```java
if (condition)
{
    // statements
}
```

### if-else

Used when there are two possible execution paths.

```java
if (condition)
{
    // true
}
else
{
    // false
}
```

### Nested if

An `if` statement placed inside another `if` statement.

### else-if Ladder

Used when multiple conditions need to be checked.

### switch

Useful when selecting one option from multiple fixed choices.

```java
switch (choice)
{
    case 1:
        // statement
        break;

    case 2:
        // statement
        break;

    default:
        // statement
}
```

`break` exits the current switch case. Without it, execution may continue into the following cases.

---

# 06 — Loops

### Topics Covered

* `while`
* `do-while`
* `for`
* Nested loops
* `break`
* `continue`
* Number problems
* Pattern programs

### Loop Types

#### while

```java
while (condition)
{
    // statements
}
```

The condition is checked before execution.

#### do-while

```java
do
{
    // statements
}
while (condition);
```

The loop body executes at least once.

#### for

```java
for (initialization; condition; update)
{
    // statements
}
```

### Problem-Solving Practice

The module includes practice problems involving:

* Sum of numbers
* Sum of digits
* Reverse number
* Palindrome number
* Factorial
* Fibonacci series
* Prime numbers
* Armstrong numbers
* Perfect numbers
* Pythagorean triplets
* Multiplication tables

### Pattern Practice

* Filled rectangle
* Right triangle
* Number patterns
* Character patterns

---

# 07 — Methods

### Topics Covered

* Method declaration
* Method calling
* Parameters
* Arguments
* Return values
* Static methods
* Method overloading
* Recursion
* Java pass-by-value

### Method

A method is a block of code that performs a specific task and executes when it is called.

### Basic Syntax

```java
returnType methodName(parameters)
{
    // statements
}
```

### Four Common Method Categories

1. No parameter, no return value
2. Parameter, no return value
3. No parameter, return value
4. Parameter, return value

### Method Overloading

Method overloading means having multiple methods with the same name but different parameter lists.

```java
add(int a, int b)
add(double a, double b)
```

Return type alone cannot be used for method overloading.

### Recursion

Recursion occurs when a method calls itself.

A recursive method must have a proper base condition to stop recursion.

---

# 08 — Arrays

### Topics Covered

* Array declaration
* Array creation
* Array initialization
* Array traversal
* Array input/output
* Array length
* Searching
* Linear search
* Sorting
* Reversing
* Copying
* Largest and smallest elements
* Second largest element
* Counting elements
* Removing duplicates
* Passing arrays to methods
* Returning arrays from methods
* Two-dimensional arrays
* Matrix operations

### Array

An array is a fixed-size collection of elements of the same data type.

```java
int[] numbers = {10, 20, 30, 40, 50};
```

Array indexing starts from `0`.

```text
numbers[0] → first element
numbers[1] → second element
```

Array size:

```java
numbers.length
```

### Array Traversal

```java
for (int i = 0; i < numbers.length; i++)
{
    System.out.println(numbers[i]);
}
```

### Enhanced for Loop

```java
for (int number : numbers)
{
    System.out.println(number);
}
```

### Two-Dimensional Arrays

2D arrays are commonly used for tables and matrices.

```java
int[][] matrix =
{
    {1, 2, 3},
    {4, 5, 6}
};
```

### Matrix Operations

* Matrix addition
* Matrix subtraction
* Matrix transpose
* Matrix diagonal sum
* Matrix multiplication

### Important Points

* Arrays have fixed size.
* Array indexing starts from `0`.
* `array.length` gives the number of elements.
* Invalid indexes can cause `ArrayIndexOutOfBoundsException`.
* Arrays can be passed to methods.
* Methods can return arrays.

---

# 9 — Strings

### Topics Covered

* String basics
* String creation
* String input
* String length
* Character access
* String traversal
* String reverse
* String palindrome
* String comparison
* String methods
* Substring
* Searching
* Replacing
* Case conversion
* Trimming
* Character counting
* Word counting
* Character frequency
* Character arrays
* String concatenation

### String

A String is a sequence of characters.

```java
String name = "Java";
```

### String Immutability

Strings in Java are immutable.

Once a String object is created, its content cannot be changed. Operations such as `replace()`, `toUpperCase()` and `concat()` return a new String.

### Important String Methods

| Method               | Purpose                         |
| -------------------- | ------------------------------- |
| `length()`           | Returns string length           |
| `charAt()`           | Returns character at an index   |
| `equals()`           | Compares string content         |
| `equalsIgnoreCase()` | Compares ignoring case          |
| `substring()`        | Extracts part of a string       |
| `indexOf()`          | Finds index                     |
| `contains()`         | Checks whether text exists      |
| `replace()`          | Replaces characters/text        |
| `toUpperCase()`      | Converts to uppercase           |
| `toLowerCase()`      | Converts to lowercase           |
| `trim()`             | Removes leading/trailing spaces |
| `toCharArray()`      | Converts String to char array   |

### Important Points

Use:

```java
str1.equals(str2)
```

to compare String content.

`indexOf()` returns `-1` when the searched value is not found.

For:

```java
substring(beginIndex, endIndex)
```

the `endIndex` is exclusive.

### String vs Array

```text
Array:
array.length

String:
string.length()
```

### String Problem-Solving Practice

* Reverse String
* Palindrome String
* Count vowels and consonants
* Count characters
* Count words
* Character frequency
* Find a character
* Remove spaces
* Count digits
* Count special characters
* String to character array
* Character array to String
* String concatenation

---

# 10 — Mini Projects

This module combines concepts learned throughout the repository into beginner-level console applications.

### Concepts Used

* Variables
* Data types
* Operators
* Scanner
* Type casting
* Conditions
* Switch
* Loops
* Methods
* Arrays
* Strings
* Random numbers

### Projects Included

* Calculator
* Number Guessing Game
* Simple ATM
* Student Grade System
* Electricity Bill Calculator
* Shopping Bill
* Temperature Converter
* Unit Converter
* Rock Paper Scissors
* Quiz Game
* Password Checker
* Number Utility
* Student Result System

These projects are intentionally simple and focus on applying Core Java fundamentals together.

---

# 🧠 Core Java Concepts Covered

```text
Java Basics
    ↓
JDK / JRE / JVM
    ↓
Variables & Data Types
    ↓
Operators
    ↓
Input / Output
    ↓
Decision Making
    ↓
Loops
    ↓
Methods
    ↓
Arrays
    ↓
Strings
    ↓
Problem Solving
    ↓
Mini Projects
```

---

# 🎯 Problem-Solving Areas

This repository provides practice in:

* Conditional logic
* Mathematical calculations
* Number manipulation
* Pattern printing
* Searching
* Sorting
* Array processing
* Matrix operations
* String processing
* Character handling
* Method-based problem solving
* Menu-driven applications
* Basic console application design

---

# 🛠️ Technologies Used

* **Java**
* **JDK**
* **VS Code**
* **Git**
* **GitHub**

---

# ▶️ How to Run

### Clone the Repository

```bash
git clone <your-repository-url>
```

### Compile a Program

```bash
javac FileName.java
```

### Run a Program

```bash
java FileName
```

Example:

```bash
javac HelloJava.java
java HelloJava
```

---

# 📁 Repository Structure

```text
core-java-fundamentals/
│
├── README.md
├── 01-java-basics/
├── 02-java-environment/
├── 04-operators/
├── 05-input-output/
├── 06-decision-making/
├── 07-loops/
├── 08-methods/
├── 09-arrays/
├── 10-strings/
└── 11-mini-projects/
```

Each module contains its own README and Java practice programs.

---

# 📈 Learning Progress

```text
[✓] Module 01 — Java Basics
[✓] Module 02 — Java Environment
[—] Module 03 — Skipped
[✓] Module 04 — Operators
[✓] Module 05 — Input / Output
[✓] Module 06 — Decision Making
[✓] Module 07 — Loops
[✓] Module 08 — Methods
[✓] Module 09 — Arrays
[✓] Module 10 — Strings
[✓] Module 11 — Mini Projects
```

---

# 🎓 Learning Outcomes

After completing this repository, I have practiced:

* Writing and executing Java programs
* Understanding the Java execution environment
* Working with variables and data types
* Using operators and expressions
* Taking user input using Scanner
* Implementing decision-making logic
* Working with loops
* Creating and using methods
* Performing array and matrix operations
* Manipulating Strings
* Solving common programming problems
* Building beginner-level console applications
* Combining multiple Core Java concepts in practical programs

---

# 🚀 What's Next?

After completing these fundamentals, the next stage of Java learning can include:

```text
Core Java Fundamentals
        ↓
Object-Oriented Programming
        ↓
Exception Handling
        ↓
Packages & Access Modifiers
        ↓
Wrapper Classes
        ↓
Collections Framework
        ↓
File Handling
        ↓
Java 8+ Features
        ↓
JDBC
        ↓
Spring / Spring Boot
        ↓
REST APIs
        ↓
Full-Stack Development
```

Advanced topics can be maintained in separate repositories or modules so that this repository remains focused on **Core Java fundamentals and beginner problem-solving**.

---

# 👩‍💻 Purpose

This repository is created for:

* Learning Core Java
* Practicing programming fundamentals
* Improving problem-solving skills
* Preparing for Java basics interviews and viva
* Maintaining a structured GitHub learning journey
* Demonstrating consistent programming practice

---

## ⭐ Repository Note

This repository focuses on **learning through practice** rather than simply collecting programs.

The modules progress from basic Java concepts to problem-solving and beginner projects, making the repository useful for learning, revision, interview preparation, and future development.

---

**Core Java Fundamentals — Learn → Practice → Build → Grow**

A structured collection of Core Java programs covering Java fundamentals, operators, input/output, decision making, loops, methods, arrays, and strings.
