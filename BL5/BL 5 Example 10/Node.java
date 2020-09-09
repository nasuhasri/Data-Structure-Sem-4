public class Node
{
    //Before public Object data; (not suitable)
    public Employee data;
    public Node next;
    
    public Node(Employee d){
        data=d;
    }
}