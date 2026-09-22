import java.util.Scanner;

class IllegalArgumentExceptionDemo {

    public static void generateIllegalArgumentException(
            String text, int startIndex, int endIndex) {

        if (startIndex > endIndex) {
            throw new IllegalArgumentException(
                    "Start index cannot be greater than end index."
            );
        }

        System.out.println(
                "Substring: " +
                text.substring(startIndex, endIndex)
        );
    }

    public static void handleIllegalArgumentException(
            String text, int startIndex, int endIndex) {

        try {
            if (startIndex > endIndex) {
                throw new IllegalArgumentException(
                        "Start index cannot be greater than end index."
                );
            }

            String result =
                    text.substring(startIndex, endIndex);

            System.out.println("Substring: " + result);

        } catch (IllegalArgumentException exception) {
            System.err.println(
                    "IllegalArgumentException occurred: "
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

        System.out.print("Enter start index: ");
        int startIndex = input.nextInt();

        System.out.print("Enter end index: ");
        int endIndex = input.nextInt();

        handleIllegalArgumentException(
                text, startIndex, endIndex
        );

        input.close();
    }
}