# Module 9— Strings

This module covers **Strings in Java**, including String creation, input, character access, important String methods, String manipulation, character counting, palindrome checking, and conversion between Strings and character arrays.

Strings are one of the most commonly used concepts in Java programming and are essential for handling text-based data.

---

## 📌 Topics Covered

* Introduction to Strings
* String Declaration
* String Creation
* String Literals
* `new String()`
* String Immutability
* String Input
* String Length
* Character Access
* String Traversal
* String Reverse
* String Palindrome
* String Comparison
* Important String Methods
* Character and Word Counting
* Character Frequency
* String and Character Array Conversion
* String Concatenation

---

# 1. What is a String?

A **String** is an object that represents a sequence of characters.

Example:

```java
String name = "Java";
```

Here:

* `String` → Java class
* `name` → reference variable
* `"Java"` → String value

Example:

```java
String message = "Hello Java";
```

---

# 2. Why are Strings Used?

Strings are used to store and process textual data.

Examples:

* Names
* Addresses
* Email IDs
* Passwords
* Messages
* Sentences
* User input

Example:

```java
String name = "Pragati";
String city = "Pune";
```

---

# 3. String Declaration

Syntax:

```java
String variableName;
```

Example:

```java
String name;
```

A value can then be assigned:

```java
name = "Java";
```

Or both can be done together:

```java
String name = "Java";
```

---

# 4. Creating a String

There are two common ways to create a String.

### Using String Literal

```java
String str1 = "Java";
```

### Using `new` Keyword

```java
String str2 = new String("Java");
```

Both represent the String `"Java"`.

For normal String creation, String literals are commonly preferred.

---

# 5. String Literal

A String literal is a sequence of characters written inside double quotation marks.

Example:

```java
String language = "Java";
```

Other examples:

```java
String name = "Pragati";
String city = "Pune";
String message = "Welcome to Java";
```

---

# 6. String Immutability

One of the most important properties of Java Strings is that **Strings are immutable**.

Immutable means that once a String object is created, its content cannot be changed.

Example:

```java
String text = "Java";

text.concat(" Programming");

System.out.println(text);
```

Output:

```text
Java
```

The original String is unchanged.

If we want the changed value:

```java
String text = "Java";

text = text.concat(" Programming");

System.out.println(text);
```

Output:

```text
Java Programming
```

The variable now refers to a new String object.

---

# 7. String Input

We can use `Scanner` to take String input.

### `next()`

Reads one word.

```java
String name = sc.next();
```

If input is:

```text
Pragati Pandey
```

`next()` reads only:

```text
Pragati
```

### `nextLine()`

Reads the complete line.

```java
String name = sc.nextLine();
```

For:

```text
Pragati Pandey
```

it reads:

```text
Pragati Pandey
```

---

# 8. String Length

The `length()` method returns the number of characters in a String.

Syntax:

```java
string.length()
```

Example:

```java
String text = "Java";

System.out.println(text.length());
```

Output:

```text
4
```

### Important Difference

For arrays:

```java
array.length
```

For Strings:

```java
string.length()
```

---

# 9. Accessing Characters

The `charAt()` method is used to access a character at a particular index.

Syntax:

```java
string.charAt(index)
```

Example:

```java
String text = "Java";

System.out.println(text.charAt(0));
```

Output:

```text
J
```

String indexes start from `0`.

```text
J  a  v  a
0  1  2  3
```

---

# 10. Traversing a String

A String can be traversed using a loop.

Example:

```java
String text = "Java";

for (int i = 0; i < text.length(); i++)
{
    System.out.println(text.charAt(i));
}
```

Output:

```text
J
a
v
a
```

---

# 11. Reverse a String

A String can be reversed by traversing it from the last index to the first index.

Example:

```java
String text = "Java";
String reverse = "";

for (int i = text.length() - 1; i >= 0; i--)
{
    reverse = reverse + text.charAt(i);
}

System.out.println(reverse);
```

Output:

```text
avaJ
```

---

# 12. String Palindrome

A palindrome is a String that reads the same forward and backward.

Examples:

```text
madam
level
radar
```

Example:

```java
String text = "madam";
```

Reverse:

```text
madam
```

Since both are equal, it is a palindrome.

---

# 13. String Comparison

The `equals()` method compares the contents of two Strings.

Example:

```java
String str1 = "Java";
String str2 = "Java";

System.out.println(str1.equals(str2));
```

Output:

```text
true
```

### Important

For comparing String content, prefer:

```java
str1.equals(str2)
```

Do not use:

```java
str1 == str2
```

for general content comparison.

---

# 14. `equalsIgnoreCase()`

This method compares two Strings without considering uppercase/lowercase differences.

Example:

```java
String str1 = "Java";
String str2 = "JAVA";

System.out.println(str1.equalsIgnoreCase(str2));
```

Output:

```text
true
```

---

# 15. Important String Methods

| Method               | Purpose                             |
| -------------------- | ----------------------------------- |
| `length()`           | Returns String length               |
| `charAt()`           | Returns character at an index       |
| `equals()`           | Compares String content             |
| `equalsIgnoreCase()` | Compares ignoring case              |
| `substring()`        | Extracts part of a String           |
| `indexOf()`          | Finds index of character/String     |
| `contains()`         | Checks whether text exists          |
| `replace()`          | Replaces characters/text            |
| `toUpperCase()`      | Converts to uppercase               |
| `toLowerCase()`      | Converts to lowercase               |
| `trim()`             | Removes leading/trailing whitespace |
| `toCharArray()`      | Converts String to character array  |

---

# 16. `substring()`

`substring()` extracts a portion of a String.

Example:

```java
String text = "JavaProgramming";

System.out.println(text.substring(4));
```

Output:

```text
Programming
```

Another form:

```java
text.substring(0, 4);
```

The ending index is exclusive.

So:

```text
JavaProgramming
0123456789...
```

---

# 17. `indexOf()`

The `indexOf()` method returns the index of the first occurrence of a character or String.

Example:

```java
String text = "Java Programming";

System.out.println(text.indexOf('P'));
```

If the value is not found, `indexOf()` returns:

```text
-1
```

---

# 18. `contains()`

`contains()` checks whether a particular sequence exists inside the String.

Example:

```java
String text = "Java Programming";

System.out.println(text.contains("Java"));
```

Output:

```text
true
```

---

# 19. `replace()`

The `replace()` method replaces characters or sequences.

Example:

```java
String text = "I like Java";

String result = text.replace("Java", "Python");

System.out.println(result);
```

Output:

```text
I like Python
```

---

# 20. `toUpperCase()`

Converts the String to uppercase.

```java
String text = "java";

System.out.println(text.toUpperCase());
```

Output:

```text
JAVA
```

---

# 21. `toLowerCase()`

Converts the String to lowercase.

```java
String text = "JAVA";

System.out.println(text.toLowerCase());
```

Output:

```text
java
```

---

# 22. `trim()`

`trim()` removes leading and trailing whitespace.

Example:

```java
String text = "   Java   ";

System.out.println(text.trim());
```

Result:

```text
Java
```

It does not remove spaces between words.

---

# 23. Count Vowels and Consonants

For a String such as:

```text
Java Programming
```

we can use a loop and check each character.

Vowels:

```text
a, e, i, o, u
```

Characters that are English letters but not vowels are counted as consonants.

Spaces and other non-letter characters are ignored.

---

# 24. Count Characters

Example:

```text
Java Programming
```

We can traverse the String and count each character.

If spaces should not be counted, check:

```java
if (text.charAt(i) != ' ')
```

---

# 25. Count Words

The `split()` method can divide a String into multiple parts.

Example:

```java
String text = "Java is easy to learn";

String[] words = text.trim().split("\\s+");
```

Then:

```java
words.length
```

gives the number of words.

---

# 26. Character Frequency

Frequency means the number of times a character occurs.

Example:

```text
programming
```

Frequency of `g`:

```text
2
```

A loop can be used to count occurrences.

---

# 27. Find a Character

`indexOf()` can be used to find the position of a character.

Example:

```java
String text = "Java Programming";

int index = text.indexOf('P');
```

If the character exists:

```text
Character found
```

Otherwise:

```text
Character not found
```

---

# 28. Remove Spaces

The `replace()` method can remove spaces.

Example:

```java
String text = "Java Programming";

String result = text.replace(" ", "");

System.out.println(result);
```

Output:

```text
JavaProgramming
```

---

# 29. Count Digits

We can check whether a character is a digit using:

```java
ch >= '0' && ch <= '9'
```

Example:

```text
Java123
```

Number of digits:

```text
3
```

---

# 30. Count Special Characters

A character that is not a letter, digit, or space can be treated as a special character for basic practice.

Example:

```text
Java@123!
```

Special characters:

```text
@ !
```

---

# 31. String to Character Array

The `toCharArray()` method converts a String into a character array.

Example:

```java
String text = "Java";

char[] characters = text.toCharArray();
```

Result:

```text
J a v a
```

---

# 32. Character Array to String

A character array can be converted into a String.

Example:

```java
char[] characters = {'J', 'a', 'v', 'a'};

String text = new String(characters);
```

---

# 33. String Concatenation

Concatenation means joining two or more Strings.

Using `+`:

```java
String firstName = "Pragati";
String lastName = "Pandey";

String fullName = firstName + " " + lastName;
```

Output:

```text
Pragati Pandey
```

---

# 34. String vs Character Array

| String                | Character Array                |
| --------------------- | ------------------------------ |
| `String` is a class   | `char[]` is an array           |
| Immutable             | Array elements can be modified |
| Provides many methods | Provides array operations      |
| Uses `length()`       | Uses `length`                  |
| Example: `"Java"`     | Example: `{'J','a','v','a'}`   |

---

# 35. Important Interview Points

### Q1. What is a String?

**Answer:**
A String is an object in Java that represents a sequence of characters.

### Q2. Are Strings mutable in Java?

**Answer:**
No. Strings are immutable in Java. Once a String object is created, its content cannot be changed.

### Q3. Which method is used to find String length?

**Answer:**

```java
length()
```

### Q4. Which method is used to access a character?

**Answer:**

```java
charAt()
```

### Q5. How do you compare two Strings?

**Answer:**

```java
equals()
```

### Q6. What is the difference between `==` and `equals()` for Strings?

**Answer:**
`==` compares references, while `equals()` compares String content.

### Q7. What does `indexOf()` return when a value is not found?

**Answer:**

```text
-1
```

### Q8. What is String immutability?

**Answer:**
It means the content of an existing String object cannot be modified after the object is created.

---

# 36. Common Mistakes

### Mistake 1 — Using `==` for String content comparison

Incorrect for general content comparison:

```java
str1 == str2
```

Preferred:

```java
str1.equals(str2)
```

### Mistake 2 — Confusing `length` and `length()`

Array:

```java
numbers.length
```

String:

```java
text.length()
```

### Mistake 3 — Wrong index

For:

```java
String text = "Java";
```

Valid indexes are:

```text
0, 1, 2, 3
```

`text.charAt(4)` causes an index-related exception.

### Mistake 4 — Forgetting that Strings are immutable

Methods such as:

```java
toUpperCase()
replace()
concat()
```

return a new String; they do not modify the original String object.

---

# 37. Programs in This Module

## String Fundamentals

* `StringBasics.java`
* `StringCreation.java`
* `StringInput.java`
* `StringLength.java`
* `StringCharacterAccess.java`
* `StringReverse.java`
* `StringPalindrome.java`

## String Methods

* `StringMethods.java`
* `StringComparison.java`
* `StringEqualsIgnoreCase.java`
* `StringSubstring.java`
* `StringIndexOf.java`
* `StringContains.java`
* `StringReplace.java`
* `StringUpperLowerCase.java`
* `StringTrim.java`

## String Problem Solving

* `CountVowelsConsonants.java`
* `CountCharacters.java`
* `CountWords.java`
* `CharacterFrequency.java`
* `FindCharacter.java`
* `RemoveSpaces.java`
* `CountDigits.java`
* `CountSpecialCharacters.java`

## String and Character Array

* `StringToCharArray.java`
* `CharArrayToString.java`
* `StringConcatenation.java`

---

# 38. Practice Order

Recommended order for learning:

```text
1. StringBasics
2. StringCreation
3. StringInput
4. StringLength
5. StringCharacterAccess
6. StringReverse
7. StringPalindrome
8. StringMethods
9. StringComparison
10. StringEqualsIgnoreCase
11. StringSubstring
12. StringIndexOf
13. StringContains
14. StringReplace
15. StringUpperLowerCase
16. StringTrim
17. CountVowelsConsonants
18. CountCharacters
19. CountWords
20. CharacterFrequency
21. FindCharacter
22. RemoveSpaces
23. CountDigits
24. CountSpecialCharacters
25. StringToCharArray
26. CharArrayToString
27. StringConcatenation
```

---

# 39. Quick Revision

```text
String
   ↓
Sequence of characters
   ↓
Immutable
   ↓
Index starts from 0
   ↓
length()
   ↓
charAt()
   ↓
equals()
   ↓
substring()
   ↓
indexOf()
   ↓
contains()
   ↓
replace()
   ↓
toUpperCase() / toLowerCase()
   ↓
trim()
   ↓
toCharArray()
```

---

## Learning Outcome

After completing this module, you should be able to:

* Create and initialize Strings.
* Take String input.
* Find String length.
* Access individual characters.
* Traverse Strings.
* Reverse a String.
* Check String palindrome.
* Compare Strings.
* Use important String methods.
* Count vowels and consonants.
* Count characters and words.
* Find character frequency.
* Search characters.
* Remove spaces.
* Count digits and special characters.
* Convert String to `char[]`.
* Convert `char[]` to String.
* Perform String concatenation.



