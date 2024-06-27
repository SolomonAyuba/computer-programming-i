public class Week7_MidLessonQuestion {
    public static void main(String[] args) {
    /*
        Mid-lesson question
        Assume you are assigned a task of designing a library management system in Java. Create a class “Book” to represent books in the library.

        Each book has the following attributes: title (String), author (String), isbn (String), numPages (int) and available (boolean).
        The class should have the following methods: borrowBook(), returnBook() and displayBookInfo().

        1. Create multiple instances of the Book class to represent different books in the library.
        2. Perform borrowing and returning operations on the books, and display their information.

        Answer: Mid-lesson question
     */
        class Book {
            private String title;
            private String author;
            private String isbn;
            private int numPages;
            private boolean available;

            public void setTitle(String title) {
                this.title = title;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public void setISBN(String isbn) {
                this.isbn = isbn;
            }

            public void setNumPages(String numPages) {
                this.numPages = Integer.parseInt(numPages);
            }


            public void borrowBook() {
                if (available) {
                    available = false;
                    System.out.println("You have borrowed the book: " + title);
                } else {
                    System.out.println("Sorry, the book " +
                            title + " is not available for borrowing.");
                }
            }

            public void returnBook() {
                if (!available) {
                    available = true;
                    System.out.println("You have returned the book: " + title);
                } else {
                    System.out.println("The book " +
                            title + " is already available.");
                }
            }

            public void displayBookInfo() {
                System.out.println("Title: " + title);
                System.out.println("Author : " + author);
                System.out.println("ISBN: " + isbn);
                System.out.println("Number of Pages: " + numPages);
                System.out.println("Availability:  " + (available ? "Available" : "Not Available"));
            }

            public static void main(String[] args) {
                Book book1 = new Book();
                book1.setTitle("The Great Dawn");
                book1.setAuthor("W. Smith");
                book1.setISBN("978-0743273565");
                book1.setNumPages(String.valueOf(180));
                book1.setAvailable(true);

                Book book2 = new Book();
                book2.setTitle("Life matters");
                book2.setAuthor("D. Jones");
                book2.setISBN("978-0061120084");
                book2.setNumPages(String.valueOf(281));
                book2.setAvailable(true);

                // Borrow and return operations
                book1.borrowBook();
                book2.borrowBook();
                book1.returnBook();
                book2.returnBook();

                // Display book information
                book1.displayBookInfo();
                book2.displayBookInfo();
            }

            public void setAvailable(boolean available) {
                this.available = available;
            }

            public boolean isAvailable() {
                return available;
            }
        }
    }
}