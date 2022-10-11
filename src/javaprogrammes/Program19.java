package javaprogrammes;

/*
 Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19 {
    public static void main(String[] args) {
        convert();
    }
    public static void convert(){
        String upperCase = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(upperCase.toLowerCase());
    }
}