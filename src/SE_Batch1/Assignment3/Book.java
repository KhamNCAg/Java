package SE_Batch1.Assignment3;

class Book {
    private String title;
    private String subtitle;
    private static int bookCount = 0;

    // Constructor for title only
    public Book(String title) {
        this.title = title;
        this.subtitle = "";
        bookCount++;
    }

    // Constructor for title and subtitle
    public Book(String title, String subtitle) {
        this.title = title;
        this.subtitle = subtitle;
        bookCount++;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        if (!subtitle.isEmpty()) {
            System.out.println("Subtitle: " + subtitle);
        }
        System.out.println();
    }

    // Static method to get the total number of books created
    public static int getBookCount() {
        return bookCount;
    }
}
