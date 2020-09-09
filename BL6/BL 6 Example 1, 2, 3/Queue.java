import java.util.NoSuchElementException;

public class Queue extends linkedList
{
    public Queue(){
    }
    
    //Add new item at the back
    public void enqueue(Object elem){
        insertAtBack(elem);
    }
    
    //Delete item from the front
    public Object dequeue(){
        return removeFromFront();
    }
    
    //To get data at the front
    public Object getFront(){
        return getFirst();
    }
    
    //To get data at the back
    public Object getEnd(){
        Object obj = removeFromBack();
        insertAtBack(obj); // reinsert
        return obj;
    }
    
}