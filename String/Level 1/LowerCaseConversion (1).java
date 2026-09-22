import java.util.Scanner;

class LowerCaseConversion {

    public static String convertToLowerCase(String text) {
        String result = "";
        int asciiDifference = 'a' - 'A';

        for (int i = 0; i < text.length(); i++) {
            char currentCharacter = text.charAt(i);

            if (currentCharacter >= 'A'
                    && currentCharacter <= 'Z') {

                currentCharacter =
                        (char) (currentCharacter + asciiDifference);
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
                convertToLowerCase(text);

        String builtInResult =
                text.toLowerCase();

        boolean result =
                compareStrings(
                        userDefinedResult,
                        builtInResult
                );

        System.out.println(
                "User-defined lowercase: "
                + userDefinedResult
        );

        System.out.println(
                "Built-in lowercase: "
                + builtInResult
        );

        System.out.println(
                "Both results are equal: " + result
        );

        input.close();
    }
}