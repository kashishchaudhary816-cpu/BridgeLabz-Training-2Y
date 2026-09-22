import java.util.Scanner;

class UpperCaseConversion {

    public static String convertToUpperCase(String text) {
        String result = "";
        int asciiDifference = 'a' - 'A';

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);

            if (currentCharacter >= 'a'
                    && currentCharacter <= 'z') {

                currentCharacter =
                        (char) (currentCharacter - asciiDifference);
            }

            result += currentCharacter;
        }

        return result;
    }

    public static boolean compareStrings(
            String firstString, String secondString) {

        if (firstString.length() != secondString.length()) {
            return false;
        }

        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i)
                    != secondString.charAt(i)) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine();

        String userDefinedResult =
                convertToUpperCase(text);

        String builtInResult =
                text.toUpperCase();

        boolean result =
                compareStrings(
                        userDefinedResult,
                        builtInResult
                );

        System.out.println(
                "User-defined uppercase: "
                + userDefinedResult
        );

        System.out.println(
                "Built-in uppercase: "
                + builtInResult
        );

        System.out.println(
                "Both results are equal: " + result
        );

        input.close();
    }
}