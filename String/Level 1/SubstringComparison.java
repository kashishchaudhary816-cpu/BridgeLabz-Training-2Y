import java.util.Scanner;

class SubstringComparison {

    public static String createSubstring(String text, int startIndex, int endIndex) {
        String result = "";

        for (int i = startIndex; i < endIndex; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String firstString, String secondString) {
        if (firstString.length() != secondString.length()) {
            return false;
        }

        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) != secondString.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        System.out.print("Enter start index: ");
        int startIndex = input.nextInt();

        System.out.print("Enter end index: ");
        int endIndex = input.nextInt();

        if (startIndex < 0 || endIndex > text.length() || startIndex > endIndex) {
            System.err.println("Invalid start or end index.");
            input.close();
            System.exit(0);
        }

        String userDefinedSubstring =
                createSubstring(text, startIndex, endIndex);

        String builtInSubstring =
                text.substring(startIndex, endIndex);

        boolean result =
                compareStrings(userDefinedSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + userDefinedSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Both substrings are equal: " + result);

        input.close();
    }
}