package Day5_Inheritance.SingleInheritance;
 
class Book {
 String title;
 int publicationYear;

 Book(String title, int publicationYear) {
     this.title = title;
     this.publicationYear = publicationYear;
 }

 void displayInfo() {
     System.out.println("Title: " + title);
     System.out.println("Publication Year: " + publicationYear);
 }
}

 
class Author extends Book {
 String name;
 String bio;

 Author(String title, int publicationYear, String name, String bio) {
     super(title, publicationYear);  
     this.name = name;
     this.bio = bio;
 }

 @Override
 void displayInfo() {
     super.displayInfo(); // show book info
     System.out.println("Author Name: " + name);
     System.out.println("Author Bio: " + bio);
 }
}
 
public class LibraryMgmt {
 public static void main(String[] args) {
      
     Author authorBook = new Author(
         "Java Programming", 
         2021, 
         "James Gosling", 
         "James is the creator of Java and a software engineer."
     );

     System.out.println("=== Book & Author Information ===");
     authorBook.displayInfo();
 }
}
