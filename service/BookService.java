package service;
import model.Book;
import java.util.Scanner;
public class BookService implements BooksInterface{
    private Book[] books=new Book[100];
    private int count=0;
    public void addBooks(Book b){
        if(count<books.length){
            books[count]=b;
            count++;
            System.out.println("Book Added Successfully...");
        }
        else{
            System.out.println("Limit Reached No More Books!!!");
        }
    }
    public void displayBooks(){
        if(count==0){
            System.out.println("No Books Avaiable!!!");
        }
        else{
            System.out.println("List of Books : \n");
            for(int i=0;i<count;i++){
                Book b=books[i];
                System.out.println("\nBook ID : "+b.getBookId()+"\n"+"Book Title : "+b.getTitle()+"\n"+"Author Name : "+b.getAuthorName()+"\n"+"Avaiability : "+b.getAvailability());
            }
        }
    }
    public void searchBook(String title){
        int found=0;
        for(int i=0;i<count;i++){
            Book b=books[i];
            if((b.getTitle()).equalsIgnoreCase(title)){
                System.out.println("Book Found!!!");
                System.out.println("\nBook ID : "+b.getBookId()+"\n"+"Author Name : "+b.getAuthorName()+"\n"+"Avaiability : "+b.getAvailability());
                found=1;
                break;
            }
        }
        if(found==0){
            System.out.println("Book Not Avaiable!!!");
        }
    }
    public void issueBook(int book_id){
        int found=0;
        for(int i=0;i<count;i++){
            Book b=books[i];
            if(b.getBookId()==book_id && b.getAvailability()==true){
                b.setAvailability(false);
                System.out.println("Book Has been Issued!!!");
                 System.out.println("\n"+"Book Title : "+b.getTitle()+"\n"+"Author Name : "+b.getAuthorName());
                 found=1;
                 break;
            }
        }
        if(found==0){
             System.out.println("Book Not Avaiable!!!");
        }
    }
    public void returnBook(int book_id){
        int found=0;
        for(int i=0;i<count;i++){
            Book b=books[i];
            if(b.getBookId()==book_id && b.getAvailability()==false){
                b.setAvailability(true);
                System.out.println("Book Has Been Returned!!!");
                System.out.println("\n"+"Book Title : "+b.getTitle()+"\n"+"Author Name : "+b.getAuthorName());
                found=1;
                break;
            }
        }
         if(found==0){
             System.out.println("Book Not Avaiable!!!");
        }
    }
    public void updateBook(int book_id){
        int found=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<count;i++){
            Book b=books[i];
            if(b.getBookId()==book_id && b.getAvailability()==true){
                System.out.println("Enter the New Book Title : ");
                String newtitle=sc.nextLine();
                System.out.println("Enter the Author Name : ");
                String newname=sc.nextLine();
                b.setAuthorName(newname);
                b.setTitle(newtitle);
                System.out.println("Successfully Updated!!!");
                System.out.println("Updated Details : ");
                System.out.println("\nBook ID : "+b.getBookId()+"\n"+"Book Title : "+b.getTitle()+"\n"+"Author Name : "+b.getAuthorName()+"\n"+"Avaiability : "+b.getAvailability());
                found=1;
                break;
            }
        }
         if(found==0){
             System.out.println("Book Not Avaiable!!!");
        }
    }
}