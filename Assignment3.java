import java.util.Arrays;
import java.util.Scanner;
 class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String str1 = sc.nextLine();
        System.out.print("str2 = ");
        String str2 = sc.nextLine();
        System.out.print("str3 = ");
        String str3 = sc.nextLine();
        String clean = str1.replaceAll("[^a-zA-Z0-9]", "");
        String reverse = new StringBuilder(clean)
                .reverse()
                .toString();
        boolean palindrome = clean.equalsIgnoreCase(reverse);
        String a = str2.toLowerCase();
        String b = str3.toLowerCase();
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean anagram = Arrays.equals(arr1, arr2);
        boolean valid = clean.matches("[a-zA-Z0-9]+");
        boolean containsPlan = str1.toLowerCase().contains("plan");
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = s2.intern();
        boolean hashEqual = s1.hashCode() == s3.hashCode();
        System.out.println("\nOutput:");
        System.out.println("Palindrome Check: \"" + str1 + "\" -> " + palindrome);
        System.out.println("Anagram Check: \"" + str2 + "\" & \"" + str3 + "\" -> " + anagram);
        System.out.println("Formatted Report: [Palindrome: " + palindrome
                + " | Anagram: " + anagram + "]");
        System.out.println("Contains \"plan\": " + containsPlan);
        System.out.println("HashCode equal for interned strings: " + hashEqual);
        sc.close();
    }
}