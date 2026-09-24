public static int minBooksForTargetCost(Book[] books, int count, double targetCost) {
    int left = 0;
    double sum = 0;
    int minLength = Integer.MAX_VALUE;

    for (int right = 0; right < count; right++) {
        sum = sum + books[right].price;

        while (sum >= targetCost) {
            int length = right - left + 1;

            if (length < minLength)
                minLength = length;

            sum = sum - books[left].price;
            left++;
        }
    }

    if (minLength == Integer.MAX_VALUE)
        return 0;

    return minLength;
}