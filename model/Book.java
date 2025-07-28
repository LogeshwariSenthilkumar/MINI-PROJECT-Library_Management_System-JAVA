package model;
public class Book{
    private int book_id;
    private String title;
    private String author_name;
    boolean isAvailable;
    public Book(int book_id,String title,String author_name,boolean isAvailable){
        this.book_id=book_id;
        this.title=title;
        this.author_name=author_name;
        this.isAvailable=isAvailable;
    }

    public int getBookId(){
        return book_id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthorName(){
        return author_name;
    }
    public boolean getAvailability(){
        return isAvailable;
    }
     public void setTitle(String title){
        this.title=title;
    }
    public void setAuthorName(String author_name){
        this.author_name=author_name;
    }
    public void setAvailability(boolean isAvailable){
        this.isAvailable=isAvailable;

    }
}