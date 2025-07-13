package Day3_KeyWords;
public class LibrarySystem {
 
    static class Book {
        
        static String libraryName = "Central City Library";
 
        private String title;
        private String author;
        private final String isbn;  
 
        public Book(String title, String author, String isbn) {
            this.title = title;
            this.author = author;
            this.isbn = isbn;
        }

     
        public static void displayLibraryName() {
            System.out.println("📚 Library Name: " + libraryName);
        }

      
        public void displayBookDetails() {
            if (this instanceof Book) {
                System.out.println("\n--- Book Details ---");
                System.out.println("Title : " + title);
                System.out.println("Author: " + author);
                System.out.println("ISBN  : " + isbn);
            } else {
                System.out.println("❌ Not a valid Book instance.");
            }
        }
    }

 
    public static void main(String[] args) {
        
        Book.displayLibraryName();
 
        Book book1 = new Book("Java Basics", "Vaibhavi Sharma", "ISBN123456");
        Book book2 = new Book("Python Pro", "Aryan Mehta", "ISBN789012");
 
        book1.displayBookDetails();
        book2.displayBookDetails();

     
        System.out.println("\nIs book1 a Book? " + (book1 instanceof Book));
    }
}

