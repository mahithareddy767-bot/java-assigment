import java.util.Scanner;

public class Assignment1 {
    public static String processString(String input) {
        String str = input.trim();
        if (str.isEmpty()) {
            return "EMPTY_STRING";
        }
        if (str.equalsIgnoreCase("admin")) {
            return "RESERVED_WORD";
        }
        str = str.replace("_"," ");
        if (str.toLowerCase().startsWith("temp") &&
            str.toLowerCase().endsWith("user")) {

            str = str.concat("_FLAGGED");
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = processString(input);
        System.out.println("Output: " + result);
        sc.close();
    }
}