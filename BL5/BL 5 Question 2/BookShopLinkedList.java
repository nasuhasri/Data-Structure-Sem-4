public class BookShopLinkedList
{
    private Node first, last, current;
    
    public BookShopLinkedList()
    {
        first=null;
        last=null;
        current=null;
    }
    
    public boolean isEmpty()
    {
        return (first==null);
    }
    
    public void addFirst(Book b)
    {
        Node newNode= new Node(b);
        
        if(isEmpty())
        {
            first=newNode;
            last=newNode;
        }
        else
        {
            newNode.next=first;
            first=newNode;
        }
    }
    
    public Book getFirst()
    {
        if (isEmpty())
        {
            return null;
        }
        else
        {
            current= first;
            return current.data;
        }
    }
    
    public Book getNext()
    {
        if(current==last)
        {
            return null;
        }
        else
        {
            current= current.next;
            return current.data;
        }
    }
}