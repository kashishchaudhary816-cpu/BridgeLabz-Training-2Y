import java.util.Scanner;

class CharacterArrayComparison {

    public static char[] convertToCharacterArray(String text) {
        char[] characters = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }

        return characters;
    }

    public static boolean compareCharacterArrays(
            char[] firstArray, char[] secondArray) {

        if (firstArray.length != secondArray.length) {
            return false;
        }

        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        char[] userDefinedArray =
                convertToCharacterArray(text);

        char[] builtInArray =
                text.toCharArray();

        boolean result =
                compareCharacterArrays(
                        userDefinedArray,
                        builtInArray
                );

        System.out.println(
                "Both character arrays are equal: " + result
        );

        System.out.println("Characters:");

        for (int i = 0; i < userDefinedArray.length; i++) {
            System.out.print(userDefinedArray[i] + " ");
        }

        System.out.println();

        input.close();
    }
}