class NullPointerExceptionDemo {

    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length());
    }

    public static void handleNullPointerException() {
        try {
            String text = null;
            System.out.println(text.length());

        } catch (NullPointerException exception) {
            System.err.println(
                    "NullPointerException occurred: "
                    + exception.getMessage()
            );
        }
    }

    public static void main(String[] args) {
        handleNullPointerException();
        System.out.println("Program executed successfully.");
    }
}