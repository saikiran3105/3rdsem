import java.util.Arrays;

public class LibraryBookShelf {
    static void shelf(int[] books) {
        for (int i = 1; i < books.length; i++) {
            int newBook = books[i];
            int j = i - 1;

            while (j >= 0 && books[j] > newBook) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = newBook;
            System.out.println("After placing " + newBook + ": " + Arrays.toString(books));
        }
    }

    public static void main(String[] args) {
        int[] books = {30, 10, 40, 20};
        shelf(books);
    }
}
