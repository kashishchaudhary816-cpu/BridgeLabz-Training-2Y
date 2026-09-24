public static void searchByTitle(Book[] books, int count, String query) {
    query = query.toLowerCase();

    for (int i = 0; i < count; i++) {
        if (books[i].title.toLowerCase().contains(query)) {
            System.out.println("[" + books[i].bookId + "] "
                    + books[i].title + " - Rs. " + books[i].price);
        }
    }
}