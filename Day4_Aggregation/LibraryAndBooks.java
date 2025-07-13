package Day4_Aggregation;

import java.util.*;
 
class Book {
 String title;
 String author;
 
 Book(String title, String author) {
     this.title = title;
     this.author = author;
 }
 
 void display() {
     System.out.println("Title: " + title + ", Author: " + author);
 }
}
 
class Library {
 String name;
 ArrayList<Book> books;

  
 Library(String name) {
     this.name = name;
     books = new ArrayList<>();
 }
 
 void addBook(Book b) {
     books.add(b);
 }
 
 void showLibraryBooks() {
     System.out.println("\nBooks in Library: " + name);
     for (Book b : books) {
         b.display();
     }
 }
}

 
public class LibraryAndBooks {
 public static void main(String[] args) {
     
     Book book1 = new Book("Atomic Habits", "James Clear");
     Book book2 = new Book("The Alchemist", "Paulo Coelho");
     Book book3 = new Book("Ikigai", "Francesc Miralles");
 
     Library lib1 = new Library("Central Library");
     Library lib2 = new Library("Student Library");
 
     lib1.addBook(book1);
     lib1.addBook(book2);

     lib2.addBook(book2);  
     lib2.addBook(book3);
 
     lib1.showLibraryBooks();
     lib2.showLibraryBooks();
 }
}
