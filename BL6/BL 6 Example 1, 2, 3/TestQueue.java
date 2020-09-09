public class TestQueue
{
    public static void main(String[] args)
    {
        Queue Q = new Queue();
        
        Q.enqueue(10);
        Q.enqueue(20);
        System.out.print(Q.dequeue() + " ");
        
        Q.enqueue(30);
        System.out.print(Q.dequeue() + " ");
        System.out.println(Q.dequeue());
    }
}