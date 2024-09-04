package SE_Batch1.Assignment3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Library library = new Library();
        String continueInput;

        try {
            do {
                System.out.print("Enter details for a new book:\nTitle: ");
                String title = reader.readLine();

                System.out.print("Subtitle (or press Enter to skip): ");
                String subtitle = reader.readLine();

                if (subtitle.isEmpty()) {
                    library.addBook(new Book(title));
                } else {
                    library.addBook(new Book(title, subtitle));
                }

                System.out.print("Do you want to enter another book? (yes/no): ");
                continueInput = reader.readLine();

            } while (!continueInput.equalsIgnoreCase("no"));

            library.displayAllBooks();

        } catch (IOException e) {
            System.out.println("An error occurred during input: " + e.getMessage());
        }
    }
}

class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        System.out.println("Library Inventory:");
        for (Book book : books) {
            book.displayBookInfo();
        }
        System.out.println("Total number of books created: " + Book.getBookCount());
    }
}