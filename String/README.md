# String

![image](https://github.com/Neimat1/java/assets/63751555/ceb40146-3049-40ee-9efa-b11049b14810)
```
    String hello = "Hello";
    hello = hello.replace("Hello", "Hello World");
```
Every unique string literal in Java is stored in String Constant Pool (SCP). So in this context, “Hello” is a different entity while “Hello World” is also a different entity or object in the SCP-the latter does not replace the former in memory, unlike mutable objects.


## Copilot
Certainly! Let's delve into the fascinating world of Java strings and explore how they are created and stored.
In Java, there are two ways to create a string:
- Using String Literal:
    - When you create a string using a string literal (e.g., String str1 = "Python";), the string literal is stored in the String pool (also known as the String Intern Pool or String Constant Pool).
    - The String pool is a storage area in the Java heap where string literals are kept.
    - If you create multiple string literals with the same value, they will all refer to the same object in the String pool.
    - For example:
```
    String str1 = "Python";
    String str2 = "Data Science";
    String str3 = "Python";
```
Here, str1 and str3 both refer to the same "Python" string in the String pool, while str2 is a separate object.
- Using the new Keyword:
    - When you create a string using the new keyword (e.g., String str1 = new String("Java");), a new string object is created on the heap.
    - The string literal passed as an argument (e.g., "Java") is still stored in the String pool.
    - However, the new string object created with new is not part of the String pool; it resides in the Java heap.
    - For example:
```
    String str1 = new String("Java");
    String str2 = new String("C++");
    String str3 = new String("Data Science");
```

Here, all three string objects (str1, str2, and str3) are separate instances in the heap.
To illustrate this further, consider the following code snippet:
```
    public class StringPoolExample {
        public static void main(String[] args) {
            String s1 = "Java";
            String s2 = "Java";
            String s3 = new String("Java");
            String s4 = new String("Java").intern();

            System.out.println((s1 == s2) + ", Strings are equal."); // true
            System.out.println((s1 == s3) + ", Strings are equal."); // false
            System.out.println((s1 == s4) + ", Strings are equal."); // true
        }
    }
```

- s1 and s2 both refer to the same "Java" string in the String pool.
- s3 is a new string object created using new, so it is not equal to s1.
- s4 is obtained by calling .intern() on a new string, which checks if the literal is already in the String pool and returns a reference to the pooled instance if available.
Remember that string literals created with the new keyword reside in the heap, while those created directly as literals are part of the String pool. Understanding these concepts helps optimize memory usage and performance in your Java applications. 😊


### References
- https://medium.com/@salvipriya97/string-vs-stringbuilder-vs-stringbuffer-which-one-to-choose-4308dbcc3022
- https://codechunkers.medium.com/understanding-the-immutability-of-strings-in-java-9c1b973c303#:~:text=Java%20String%20class%20is%20a,%22%2C%20%22Hello%20World%22)%3B
