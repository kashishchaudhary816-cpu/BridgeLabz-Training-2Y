import java.util.Scanner;

class ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateArrayIndexException(String[] names) {
        int invalidIndex = names.length;
        System.out.println(names[invalidIndex]);
    }

    public static void handleArrayIndexException(String[] names) {
        try {
            int invalidIndex = names.length;
            System.out.println(names[invalidIndex]);

        } catch (ArrayIndexOutOfBoundsException exception) {
            System.err.println(
                    "ArrayIndexOutOfBoundsException occurred: "
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

        int nameCount = 3;
        String[] names = new String[nameCount];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = input.next();
        }

        handleArrayIndexException(names);

        input.close();
    }
}