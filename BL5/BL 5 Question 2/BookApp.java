public class BookApp
{
    public static void main(String[] args)
    {
        Book B = new Book("Java Notes", "James Gosling", 2017);
        Book B1 = new Book("C++ Notes", "James Gosling", 2013);
        Book B2 = new Book("HMTL Notes", "Zach Efron", 2019);
        Book B3 = new Book("SQL Notes", "Adam Michael", 2019);
        Book B4 = new Book("Information System", "Edward Cullen", 2019);
        
        BookShopLinkedList bList1 = new BookShopLinkedList();
        
        bList1.addFirst(B);
        bList1.addFirst(B1);
        bList1.addFirst(B2);
        bList1.addFirst(B3);
        bList1.addFirst(B4);
        
        Book data = bList1.getFirst();
        Book minB=null;
        int countB=0;             
        int minYr=2020;

        
        while(data!=null){
            if(data.getPubYear()==2019){
                countB++;
            }
            
            if((data.getPubYear() < minYr) && (data.getAuthor().equalsIgnoreCase("James Gosling"))){
                minYr = data.getPubYear();
                minB = data;
            }
            
            data=bList1.getNext();
        }
        
        System.out.println("Number of book(s) published in 2019: " + countB);
        System.out.println("The title of the first book written by James Gosling is " + minB.getTitle());

    }
}