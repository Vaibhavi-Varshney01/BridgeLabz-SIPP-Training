package Day2_ConstructorsAccessModifiers;
public class BookLibrary {

     
    static class Book {
        public String ISBN;         
        protected String title;      
        private String author;       
 
        public Book(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }
 
        public String getAuthor() {
            return author;
        }
 
        public void setAuthor(String newAuthor) {
            this.author = newAuthor;
        }
 
        public void displayBookDetails() {
            System.out.println("\n--- Book Details ---");
            System.out.println("ISBN   : " + ISBN);
            System.out.println("Title  : " + title);
            System.out.println("Author : " + author);
        }
    }
 
    static class EBook extends Book {
        private double fileSize;

        public EBook(String ISBN, String title, String author, double fileSize) {
            super(ISBN, title, author);
            this.fileSize = fileSize;
        }

        public void displayEBookDetails() {
            System.out.println("\n--- EBook Details ---");
            System.out.println("ISBN     : " + ISBN);     
            System.out.println("Title    : " + title);  
            System.out.println("FileSize : " + fileSize + " MB");

          
            System.out.println("Author   : " + getAuthor()); 
        }
    }

 
    public static void main(String[] args) {
      
        Book book = new Book("978-1234567890", "Java Basics", "Vaibhavi Sharma");
        book.displayBookDetails();

        
        book.setAuthor("V. Sharma");
        System.out.println("Updated Author: " + book.getAuthor());
 
        EBook ebook = new EBook("978-9876543210", "Advanced Java", "Aryan Mehta", 5.2);
        ebook.displayEBookDetails();
    }
}

