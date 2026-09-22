import java.util.Scanner;

class StringIndexOutOfBoundsExceptionDemo {

    public static void generateStringIndexException(String text) {
        int invalidIndex = text.length();
        System.out.println(text.charAt(invalidIndex));
    }

    public static void handleStringIndexException(String text) {
        try {
            int invalidIndex = text.length();
            System.out.println(text.charAt(invalidIndex));

        } catch (StringIndexOutOfBoundsException exception) {
            System.err.println(
                    "StringIndexOutOfBoundsException occurred: "
                    + exception.getMessage()
            );

        } catch (RuntimeException exception) {
            System.err.println(
                    "RuntimeException occurred: "
                    + exception.getMessage()
            );
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.next();

        handleStringIndexException(text);

        input.close();
    }
}