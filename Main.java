import java.util.Scanner;
import model.Book;
import service.BookService;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        BookService bs=new BookService();
        int choice;
        boolean run=true;
        while(run){
            System.out.println("<========== Library Management System ==========>");
            System.out.println("\n1.Add Books");
            System.out.println("\n2.Display Books");
            System.out.println("\n3.Search by Title");
            System.out.println("\n4.Issue a Book");
            System.out.println("\n5.Return a Book");
            System.out.println("\n6.Update a Book Details By ID");
            System.out.println("\n7.Exit");
            System.out.println("\nEnter the Choice : ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("\nEnter the Book_ID : ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("\nEnter the Book Title : ");
                    String title=sc.nextLine();
                    System.out.println("\nEnter the Author Name : ");
                    String name=sc.nextLine();
                    System.out.println("\nEnter the Avaiability : ");
                    boolean isavaial=sc.nextBoolean();
                    Book b=new Book(id,title,name,isavaial);
                    bs.addBooks(b);
                    break;
                case 2:
                    bs.displayBooks();
                    break;
                case 3:
                    System.out.println("\nEnter the Title to be Searched : ");
                    String titlef=sc.nextLine();
                    bs.searchBook(titlef);
                    break;
                case 4:
                    System.out.println("Enter the Book ID To be Issued : ");
                    int idf=sc.nextInt();
                    bs.issueBook(idf);
                    break;
                case 5:
                    System.out.println("Enter the Book ID To be Returned : ");
                    int idr=sc.nextInt();
                    bs.returnBook(idr);
                    break;
                case 6:
                    System.out.println("Enter the Book ID To be Updated : ");
                    int idu=sc.nextInt();
                    bs.updateBook(idu);
                    break;
                case 7:
                    run=false;
                    System.out.println("Exiting ... Thank you ...");
                    break;
                default:
                    System.out.println("Invalid Choice!!!");


            }
        }
    }
}