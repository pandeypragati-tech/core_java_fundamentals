# Module 8 — Arrays

This module covers arrays in Java, including one-dimensional arrays, two-dimensional arrays, searching, sorting, array manipulation, and passing arrays to methods.

Arrays are one of the fundamental data structures in Java and are commonly used to store and process multiple values of the same data type.

---

# 1. What is an Array?

An **array** is a fixed-size collection of elements of the same data type stored under a single variable name.

Example:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

Here:

* `int` → data type
* `numbers` → array name
* `[]` → array declaration
* `{10, 20, 30, 40, 50}` → elements

---

# 2. Why Do We Use Arrays?

Suppose we want to store the marks of five students.

Without an array:

```java
int mark1 = 80;
int mark2 = 75;
int mark3 = 90;
int mark4 = 85;
int mark5 = 70;
```

With an array:

```java
int[] marks = {80, 75, 90, 85, 70};
```

Arrays make it easier to:

* Store multiple values
* Process data using loops
* Search data
* Sort data
* Perform calculations
* Work with matrices

---

# 3. Important Characteristics of Arrays

1. Arrays have a fixed size.
2. All elements normally have the same data type.
3. Array indexing starts from `0`.
4. Arrays are objects in Java.
5. The size of an array is available using `length`.
6. Array indices range from `0` to `length - 1`.

Example:

```java
int[] numbers = {10, 20, 30};
```

Indexes:

```text
10 → 0
20 → 1
30 → 2
```

Therefore:

```java
numbers[0]   // 10
numbers[1]   // 20
numbers[2]   // 30
```

---

# 4. Array Declaration

Syntax:

```java
dataType[] arrayName;
```

Example:

```java
int[] numbers;
```

Another valid syntax:

```java
int numbers[];
```

The first style is generally preferred because it clearly shows that the variable is an array.

---

# 5. Array Creation

An array can be created using the `new` keyword.

```java
int[] numbers = new int[5];
```

This creates an integer array containing five elements.

Default values:

```text
int      → 0
double   → 0.0
boolean  → false
char     → '\u0000'
reference types → null
```

---

# 6. Array Initialization

An array can be initialized directly:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

Another way:

```java
int[] numbers = new int[]{10, 20, 30, 40, 50};
```

---

# 7. Accessing Array Elements

Array elements are accessed using their index.

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[0]);
```

Output:

```text
10
```

---

# 8. Modifying Array Elements

Array elements can be changed using their index.

```java
int[] numbers = {10, 20, 30};

numbers[1] = 50;
```

The array becomes:

```text
10 50 30
```

---

# 9. Array Length

The `length` property returns the number of elements in an array.

```java
int[] numbers = {10, 20, 30, 40};

System.out.println(numbers.length);
```

Output:

```text
4
```

### Important

For arrays:

```java
array.length
```

For strings:

```java
string.length()
```

`length` is a property for arrays, while `length()` is a method of `String`.

---

# 10. Traversing an Array

Traversal means visiting each element of an array.

Using a `for` loop:

```java
int[] numbers = {10, 20, 30, 40};

for (int i = 0; i < numbers.length; i++)
{
    System.out.println(numbers[i]);
}
```

---

# 11. Enhanced for Loop

Java also provides an enhanced `for` loop, commonly called the **for-each loop**.

Syntax:

```java
for (dataType variable : array)
{
    // statements
}
```

Example:

```java
int[] numbers = {10, 20, 30};

for (int number : numbers)
{
    System.out.println(number);
}
```

It is useful when we need to read each element without directly working with indexes.

---

# 12. Taking Array Input

Arrays can be populated using `Scanner`.

Example:

```java
Scanner sc = new Scanner(System.in);

int[] numbers = new int[5];

for (int i = 0; i < numbers.length; i++)
{
    numbers[i] = sc.nextInt();
}
```

---

# 13. Searching an Array

Searching means finding whether a particular element exists in an array.

Example:

```text
Array: 10 20 30 40 50

Search: 30
```

Result:

```text
Element found
```

---

# 14. Linear Search

Linear search checks elements one by one from the beginning of the array.

Example:

```java
for (int i = 0; i < numbers.length; i++)
{
    if (numbers[i] == key)
    {
        System.out.println("Element found");
    }
}
```

### Time Complexity

* Best case: `O(1)`
* Worst case: `O(n)`

---

# 15. Sorting

Sorting means arranging elements in a particular order.

Ascending order:

```text
10 20 30 40 50
```

Descending order:

```text
50 40 30 20 10
```

A basic sorting algorithm can be implemented using nested loops.

---

# 16. Passing an Array to a Method

An array can be passed as an argument to a method.

Example:

```java
static void display(int[] numbers)
{
    for (int number : numbers)
    {
        System.out.println(number);
    }
}
```

Calling:

```java
display(numbers);
```

---

# 17. Returning an Array from a Method

A method can return an array.

Example:

```java
static int[] createArray()
{
    int[] numbers = {10, 20, 30};

    return numbers;
}
```

---

# 18. Two-Dimensional Array

A two-dimensional array can be considered a collection of rows and columns.

Example:

```java
int[][] matrix =
{
    {1, 2, 3},
    {4, 5, 6}
};
```

It contains:

* 2 rows
* 3 columns

Representation:

```text
1 2 3
4 5 6
```

Accessing an element:

```java
matrix[0][1]
```

Output:

```text
2
```

---

# 19. Traversing a 2D Array

Nested loops are commonly used.

```java
for (int i = 0; i < matrix.length; i++)
{
    for (int j = 0; j < matrix[i].length; j++)
    {
        System.out.print(matrix[i][j] + " ");
    }

    System.out.println();
}
```

---

# 20. Matrix Addition

Two matrices can be added when they have compatible dimensions.

For example:

```text
A:          B:

1 2         5 6
3 4         7 8
```

Result:

```text
6  8
10 12
```

Formula:

```text
C[i][j] = A[i][j] + B[i][j]
```

---

# 21. Matrix Transpose

The transpose of a matrix is obtained by converting rows into columns and columns into rows.

Example:

```text
Original:

1 2 3
4 5 6
```

Transpose:

```text
1 4
2 5
3 6
```

---

# 22. Diagonal Elements

For a square matrix, the main diagonal contains elements where:

```text
row index == column index
```

Example:

```text
1 2 3
4 5 6
7 8 9
```

Main diagonal:

```text
1 5 9
```

---

# 23. ArrayIndexOutOfBoundsException

Trying to access an invalid index causes an exception.

Example:

```java
int[] numbers = {10, 20, 30};

System.out.println(numbers[5]);
```

Index `5` does not exist, so Java throws:

```text
ArrayIndexOutOfBoundsException
```

Valid indexes are:

```text
0 to length - 1
```

---

# 24. Important Difference

### Array

```java
int[] numbers = new int[5];
```

* Fixed size
* Same data type
* Index-based
* `length` property

### String

```java
String name = "Java";
```

* Represents a sequence of characters
* Immutable
* Uses String methods
* `length()` method

Strings will be covered separately in **Module 10**.

---

# 25. Learning Outcomes

After completing this module, you should be able to:

* Declare and initialize arrays.
* Access array elements.
* Modify array elements.
* Traverse arrays.
* Take array input using `Scanner`.
* Use enhanced `for` loops.
* Calculate sum and average.
* Find largest and smallest elements.
* Search elements.
* Reverse arrays.
* Copy arrays.
* Sort arrays.
* Find the second largest element.
* Count different types of elements.
* Remove duplicate elements.
* Pass arrays to methods.
* Return arrays from methods.
* Work with 2D arrays.
* Perform basic matrix operations.

---

# Files in This Module

## Basic Array Programs

* `ArrayDeclaration.java`
* `ArrayInitialization.java`
* `ArrayTraversal.java`
* `ArrayInput.java`
* `ArrayOutput.java`

## Array Problem Solving

* `ArraySum.java`
* `ArrayAverage.java`
* `LargestElement.java`
* `SmallestElement.java`
* `SearchElement.java`
* `LinearSearch.java`
* `ReverseArray.java`
* `CopyArray.java`
* `SortArray.java`
* `SecondLargestElement.java`
* `CountEvenOdd.java`
* `CountPositiveNegative.java`
* `CountZeros.java`
* `RemoveDuplicates.java`

## Arrays and Methods

* `PassArrayToMethod.java`
* `ReturnArrayFromMethod.java`

## Two-Dimensional Arrays

* `TwoDimensionalArray.java`
* `MatrixInput.java`
* `MatrixOutput.java`
* `MatrixAddition.java`
* `MatrixSubtraction.java`
* `MatrixTranspose.java`
* `MatrixDiagonalSum.java`
* `MatrixMultiplication.java`

---

# Quick Revision

| Concept                          | Key Point                   |
| -------------------------------- | --------------------------- |
| Array                            | Fixed-size collection       |
| Index                            | Starts from `0`             |
| Size                             | `array.length`              |
| 1D Array                         | Single row/list of elements |
| 2D Array                         | Rows and columns            |
| Traversal                        | Visiting each element       |
| Linear Search                    | Checks elements one by one  |
| Sorting                          | Arranging elements          |
| `for-each`                       | Easy way to traverse        |
| Matrix                           | 2D arrangement of values    |
| Transpose                        | Rows become columns         |
| `ArrayIndexOutOfBoundsException` | Invalid index access        |

---



# Key Takeaways

* Array indexing starts from `0`.
* The last index is `length - 1`.
* Arrays have a fixed size after creation.
* Use `array.length`, not `array.length()`.
* Arrays can be passed to methods.
* Methods can return arrays.
* Nested loops are commonly used with 2D arrays.
* Linear search checks elements sequentially.
* Sorting arranges elements in a specific order.
* Invalid indexes cause `ArrayIndexOutOfBoundsException`.
