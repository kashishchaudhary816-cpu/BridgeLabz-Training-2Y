import java.util.Scanner;

class NumberFormatExceptionDemo {

    public static void generateNumberFormatException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }

    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted Number: " + number);

        } catch (NumberFormatException exception) {
            System.err.println(
                    "NumberFormatException occurred: "
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

        System.out.print("Enter a number as text: ");
        String text = input.next();

        handleNumberFormatException(text);

        input.close();
    }
}