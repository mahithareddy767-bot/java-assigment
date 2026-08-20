import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int wordCount = words.length;
        String firstWord = words[0];
        String lastWord = words[words.length - 1];
        int firstIndex = sentence.indexOf('J');
        int lastIndex = sentence.lastIndexOf('J');
        int comparison = firstWord.compareTo(lastWord);
        char[] characters = sentence.toCharArray();
        System.out.println("Output:");
        System.out.println("Word Count: " + wordCount);
        System.out.println("First Word: " + firstWord);
        System.out.println("Last Word: " + lastWord);
        System.out.println("First 'J' index: " + firstIndex);
        System.out.println("Last 'J' index: " + lastIndex);
        System.out.println("Comparison (first vs last word): " + comparison);
        sc.close();
    }
}