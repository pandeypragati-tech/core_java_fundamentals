# Module 7 — Methods

This module covers methods in Java, including method declaration, calling methods, parameters, return values, method types, method overloading, and recursion.

Methods are one of the most important concepts in Java because they help divide a large program into smaller, reusable and manageable blocks of code.

---

# 1. What is a Method?

A **method** is a block of code that performs a specific task and executes when it is called.

### Example

```java
void greet()
{
    System.out.println("Hello Java");
}
```

Here, `greet()` is a method.

---

# 2. Why Use Methods?

Methods help to:

* Reuse code
* Reduce code duplication
* Divide a large program into smaller parts
* Improve readability
* Make debugging easier
* Make programs easier to maintain

---

# 3. Method Syntax

```java
returnType methodName(parameters)
{
    // method body
}
```

Example:

```java
int add(int a, int b)
{
    return a + b;
}
```

---

# 4. Method Declaration

A method declaration generally contains:

```text
access modifier
return type
method name
parameters
method body
```

Example:

```java
public static int add(int a, int b)
{
    return a + b;
}
```

---

# 5. Calling a Method

A method is executed when it is called.

Example:

```java
greet();
```

For a method with parameters:

```java
add(10, 20);
```

---

# 6. Parameters and Arguments

### Parameter

A variable declared in the method definition is called a parameter.

```java
int add(int a, int b)
```

Here `a` and `b` are parameters.

### Argument

The actual values passed while calling the method are called arguments.

```java
add(10, 20);
```

Here `10` and `20` are arguments.

---

# 7. Return Type

The return type specifies the type of value returned by a method.

Example:

```java
int square(int number)
{
    return number * number;
}
```

The return type is `int`.

A method that does not return a value uses `void`.

```java
void display()
{
    System.out.println("Hello");
}
```

---

# 8. Four Common Method Categories

Methods can commonly be classified based on parameters and return values.

| Type | Parameters | Return Value |
| ---- | ---------- | ------------ |
| 1    | No         | No           |
| 2    | Yes        | No           |
| 3    | No         | Yes          |
| 4    | Yes        | Yes          |

---

## Type 1 — No Parameter, No Return Value

```java
void display()
{
    System.out.println("Hello");
}
```

---

## Type 2 — Parameter, No Return Value

```java
void display(int number)
{
    System.out.println(number);
}
```

---

## Type 3 — No Parameter, Return Value

```java
int getNumber()
{
    return 10;
}
```

---

## Type 4 — Parameter, Return Value

```java
int add(int a, int b)
{
    return a + b;
}
```

---

# 9. static Method

A `static` method belongs to the class rather than an object.

It can be called directly from another static method in the same class.

Example:

```java
static void display()
{
    System.out.println("Hello");
}

public static void main(String[] args)
{
    display();
}
```

---

# 10. return Statement

The `return` statement sends a value back to the calling method and terminates the current method.

Example:

```java
static int add(int a, int b)
{
    return a + b;
}
```

---

# 11. Method Overloading

Method overloading occurs when multiple methods have the same name but different parameter lists.

The parameter list can differ in:

* Number of parameters
* Type of parameters
* Order of parameters

Example:

```java
static int add(int a, int b)
{
    return a + b;
}

static int add(int a, int b, int c)
{
    return a + b + c;
}
```

### Important

Changing only the return type does **not** create method overloading.

Invalid:

```java
int add(int a, int b)
double add(int a, int b)
```

---

# 12. Recursion

Recursion occurs when a method calls itself.

Example:

```java
static void count(int n)
{
    if (n == 0)
    {
        return;
    }

    System.out.println(n);
    count(n - 1);
}
```

A recursive method should have a **base condition** to stop recursion.

---

# 13. Method Overloading vs Method Overriding

### Method Overloading

* Same class
* Same method name
* Different parameters
* Compile-time polymorphism

### Method Overriding

* Generally involves inheritance
* Child class provides a new implementation of a parent method
* Runtime polymorphism

Method overriding will be covered in the OOP module.

---

# 14. Java is Pass-by-Value

Java uses **pass-by-value**.

For primitive values, a copy of the value is passed to the method.

Example:

```java
static void change(int x)
{
    x = 100;
}
```

Changing `x` does not change the original primitive variable.

---

# 15. Important Method Rules

1. A method must have a return type or `void`.
2. A method is executed when it is called.
3. Parameters receive values from arguments.
4. A non-void method must return a compatible value.
5. `return` terminates the current method.
6. Method names should follow camelCase convention.
7. Methods should generally perform one specific task.
8. Methods can call other methods.
9. A method can call itself through recursion.
10. Method overloading requires different parameter lists.

---

# 16. Learning Outcomes

After completing this module, you should be able to:

* Define and create methods.
* Call methods.
* Pass arguments to methods.
* Return values from methods.
* Understand the four common method categories.
* Create reusable programs using methods.
* Perform method overloading.
* Understand recursion.
* Use methods to solve programming problems.

---

# Files in This Module

### Basic Methods

* `SimpleMethod.java`
* `MethodCalling.java`
* `MethodWithParameters.java`
* `MethodWithReturnValue.java`
* `MethodWithMultipleParameters.java`

### Four Method Types

* `NoParameterNoReturn.java`
* `ParameterNoReturn.java`
* `NoParameterWithReturn.java`
* `ParameterWithReturn.java`

### Problem-Solving Using Methods

* `AddUsingMethod.java`
* `EvenOddUsingMethod.java`
* `LargestOfThreeUsingMethod.java`
* `PrimeUsingMethod.java`
* `FactorialUsingMethod.java`
* `FibonacciUsingMethod.java`
* `ReverseUsingMethod.java`
* `PalindromeUsingMethod.java`

### Advanced Method Concepts

* `MethodOverloading.java`
* `MethodOverloadingExample.java`
* `RecursiveMethod.java`

---

# Quick Revision

| Concept        | Meaning                         |
| -------------- | ------------------------------- |
| Method         | Reusable block of code          |
| Parameter      | Variable in method definition   |
| Argument       | Actual value passed to method   |
| `void`         | Method returns no value         |
| `return`       | Sends value back to caller      |
| `static`       | Method belongs to class         |
| Overloading    | Same name, different parameters |
| Recursion      | Method calling itself           |
| Base condition | Stops recursion                 |

---

