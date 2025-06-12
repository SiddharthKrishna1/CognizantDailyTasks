import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println();
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library.\n");
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty.\n");
            return;
        }
        System.out.println("Library Book List:");
        for (Book b : books) {
            b.displayDetails();
        }
    }

    public void searchBookByTitle(String title) {
        boolean found = false;
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                b.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.\n");
        }
    }
}

public class LibraryManagement
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        library.addBook(new Book("Wings of Fire", "Dr. A.P.J Abdul Kalam", 250.0));
        library.addBook(new Book("The Alchemist", "Paulo Coelho", 399.0));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 350.0));

        while (true) {
            System.out.println("===== Library Menu =====");
            System.out.println("1. Add a new Book");
            System.out.println("2. Display all Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    library.addBook(new Book(title, author, price));
                    break;

                case 2:
                    library.displayAllBooks();
                    break;

                case 3:
                    System.out.print("Enter title to search: ");
                    String searchTitle = sc.nextLine();
                    library.searchBookByTitle(searchTitle);
                    break;

                case 4:
                    System.out.println("Exiting the library system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
