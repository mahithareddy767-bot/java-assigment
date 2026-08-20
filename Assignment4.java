import java.util.Scanner;
class Assignment4 {
    static String titleCase(String name) {
        String[] words = name.toLowerCase().split(" ");
        String result = "";
        for (String word : words) {
            result = result
                    + word.substring(0, 1).toUpperCase()
                    + word.substring(1)
                    + " ";
        }
        return result.trim();
    }
    static String maskEmail(String email) {
        int index = email.indexOf('@');
        String first = email.substring(0, 3);
        String stars = "*".repeat(index - 3);
        return first + stars + email.substring(index);
    }
    static boolean validEmail(String email) {

        return email.matches(
                "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"
        );
    }
    static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        String result = "";
        for (String word : words) {
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverse = reverse + word.charAt(i);
            }
            result = result + reverse + " ";
        }
        return result.trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: fullName = ");
        String name = sc.nextLine();
        System.out.print("email = ");
        String email = sc.nextLine();
        System.out.print("sentence = ");
        String sentence = sc.nextLine();
        String formattedName = titleCase(name);
        String maskedEmail = maskEmail(email);
        boolean valid = validEmail(email);
        String reversed = reverseWords(sentence);
        int count = sentence.trim().split("\\s+").length;
        System.out.println("\nOutput:");
        System.out.println("Formatted Name: " + formattedName);
        System.out.println("Masked Email: " + maskedEmail);
        System.out.println("Valid Email: " + valid);
        System.out.println("Reversed Words: " + reversed);
        System.out.println("Word Count: " + count);
        sc.close();
    }
}