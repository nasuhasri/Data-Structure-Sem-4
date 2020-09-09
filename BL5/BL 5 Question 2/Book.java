public class Book
{
    private String title;
    private String author;
    private int pubYear;
    
    //Normal constructor
    public Book (String t, String a, int y){
        title=t;
        author=a;
        pubYear=y;
    }
    
    //Accessors
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getPubYear(){
        return pubYear;
    }
    
    public String toString(){
        return ("Title of the book: " + title + "\nAuthor of the book: " + author + 
        "\nYear Published: " + pubYear);
    }
}