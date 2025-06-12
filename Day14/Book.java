class Book {
    String title, author, isbn;
    boolean isAvailable = true;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Member {
    int memberId;
    String name;
    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public Member(int id, String name) {
        this.memberId = id;
        this.name = name;
    }
}

class Library {
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<Member> members = new ArrayList<>();

    void addBook(Book b) {
        books.add(b);
    }

    void addMember(Member m) {
        members.add(m);
    }

    void borrowBook(int memberId, String isbn) {
        for (Book b : books) {
            if (b.isbn.equals(isbn) && b.isAvailable) {
                for (Member m : members) {
                    if (m.memberId == memberId) {
                        b.isAvailable = false;
                        m.borrowedBooks.add(b);
                        System.out.println(m.name + " borrowed " + b.title);
                        return;
                    }
                }
            }
        }
        System.out.println("Book not available or Member not found");
    }
}
