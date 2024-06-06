package string;

public class Main {
    public static void main(String[] args) {

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

    }
}
