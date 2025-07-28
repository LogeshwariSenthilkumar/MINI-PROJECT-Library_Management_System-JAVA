package service;
import model.Book;
public interface BooksInterface{
    void addBooks(Book b);
    void displayBooks();
    void searchBook(String title);
    void issueBook(int book_id);
    void returnBook(int book_id);
    void updateBook(int book_id);

}