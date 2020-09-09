import javax.swing.*;

public class QueueDateApp
{
    public static void main(String[] args)
    {
        Queue theQueue = new Queue();
        
        //insert data into Queue
        for(int i=0; i<5; i++){
            String number = JOptionPane.showInputDialog("Enter a number: ");
            theQueue.enqueue(number);
        }
        
        //get and print the first data in the queue
        Object data = theQueue.getFront();
        System.out.println("FIRST DATA: " + data.toString());
        
        //get and the last data in the queue
        data = theQueue.getEnd();
        System.out.println("LAST DATA: " + data.toString());
        
        //print all data in the queue
        System.out.println("DATA IN THE QUEUE: ");
        while (!theQueue.isEmpty()){
            System.out.println(theQueue.dequeue());
        }
    }
}