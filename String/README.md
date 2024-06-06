# String

When we talk about strings in java we normally use this way:
```
    String word = “Hello world”;
```
But let’s say that there’s another ways to create string in java with different styles.

## Ways to create string in java:
1. Literal String
2. Object String


### 1. Literal String

This is the normal way to create String just using type String  without using keyword ***new***.
```
    String word = “Hello world”;
```

But this way has some info we need to know like: How this way deal with memory?! This way ueses or depends on String pool. 

> [!NOTE]
>  Did you hear about String pool before ?! Did you understand what is this ?!
Let’s say a small def for this to be simple for you:
String Pool : is storage space in java heap memory where String literals are stored💡.


So in this case I want to ask myself some questions what I will get from this info?! Is this an useful info for me, and what is the difference if I created a String with keyword new?!

Let’s answer those questions to understand more what’s the difference if you don’t know:
```
    String word = “Hello world”;
    String word2 = “Hello world”;
    String word3 = “Hello world”;
```

All 3 variables will have the same memory. Why?!

We said that literal strings stored in String pool and now we have 3 words have the same value Hello world”   what  will happen ?!
String pool will have only one instance and all 3 words will point to this value.
Now we can understand why   ***word == word3***  will be true - they point to the same address in memory-.
***word.eqyal( word3)***  will be true also because the value for string is the same.
 
### 2. Object String

This is the second way to create String just using keyword ***new***.
```
    String wordObject = new String(“Hello world”);
```
difference here object will, it will be created directly in the heap itself and the literal itself will be added to string pool if not exist.
```
    String wordObject  = new String(“Hello world”); 
    String wordObject2  = new String(“Hello world”); 
    String wordObject3  = new String(“Hello world”);
```

Here there’s the difference, all objects have the same value but not the same memory address because each object created with keyword new will has its record in heap memory.
So ***wordObject == wordObject2***  will be false - memory address is different -.
But  ***wordObject .equal(wordObject2)***  will be true –they have the same value-.


## Example
```
        String word = "Hello world";
        String word2 = "Hello world";
        String wordObject = new String("Hello world");
        String wordObject2 = new String("Hello world");

        System.out.println("word.equals(word2) : " + word.equals(word2));
        System.out.println("wordObject.equals(wordObject2) : " + wordObject.equals(wordObject2));
        System.out.println("word.equals(wordObject2) : " + word.equals(wordObject2));
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("word == word2 : " + (word == word2));
        System.out.println("wordObject == wordObject2 : " + (wordObject == wordObject2));
        System.out.println("word == wordObject2  : " + (word == wordObject2));
        System.out.println("-------------------------------------------------------------------------------");

        System.out.println("Memory address of word : " + Integer.toHexString(System.identityHashCode(word)));
        System.out.println("Memory address of word2 : " + Integer.toHexString(System.identityHashCode(word2)));
        System.out.println("Memory address of wordObject : " + Integer.toHexString(System.identityHashCode(wordObject)));
        System.out.println("Memory address of wordObject2 : " + Integer.toHexString(System.identityHashCode(wordObject2)));


        word.equals(word2) : true
        wordObject.equals(wordObject2) : true
        word.equals(wordObject2) : true
        -------------------------------------------------------------------------------
        word == word2 : true
        wordObject == wordObject2 : false
        word == wordObject2  : false
        -------------------------------------------------------------------------------
        Memory address of word : 6bf256fa
        Memory address of word2 : 6bf256fa
        Memory address of wordObject : 3fb6a447
        Memory address of wordObject2 : 79b4d0f
```
 



	
	


## References
- https://medium.com/@salvipriya97/string-vs-stringbuilder-vs-stringbuffer-which-one-to-choose-4308dbcc3022
- https://codechunkers.medium.com/understanding-the-immutability-of-strings-in-java-9c1b973c303#:~:text=Java%20String%20class%20is%20a,%22%2C%20%22Hello%20World%22)%3B
