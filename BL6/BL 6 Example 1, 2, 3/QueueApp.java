import javax.swing.*;

public class QueueApp
{
    public static void main(String[] args){
        Queue theQueue = new Queue();
        Queue tempQueue = new Queue(); //Temporary queue
        
        /*//insert data into Queue
        for(int i=0; i<3; i++){
            String number = JOptionPane.showInputDialog("Enter a number: ");
            int num = Integer.parseInt(number);
            theQueue.enqueue(number);
        }*/
        
        theQueue.enqueue(10);
        theQueue.enqueue(20);
        theQueue.enqueue(30);
        
        //display data in queue
        System.out.println("Data in queue: ");
        Object data = theQueue.getFront();
        while(!theQueue.isEmpty()){
            data = theQueue.dequeue();
            System.out.println(data.toString());
            tempQueue.enqueue(data);
        }
        
        //find the total, no of data, sum, max, min
        double avg;
        int count=0, sum=0, min=9999, max=-9999;
        while(!tempQueue.isEmpty()){
            data = tempQueue.dequeue();
            theQueue.enqueue(data);
            count++;
            int num = Integer.parseInt(data.toString());
            sum = sum + num;
            if(num > max)
                max = num;
            if(num < min)
                min = num;                
        }
        
        avg = sum/count;
        
        //Display result
        JOptionPane.showMessageDialog(null, "There are " + count + " items in theQueue");
        JOptionPane.showMessageDialog(null, "The sum is " + sum);
        JOptionPane.showMessageDialog(null, "The average is " + avg);
        JOptionPane.showMessageDialog(null, "The maximum number is " + max);
        JOptionPane.showMessageDialog(null, "The minimum number is " + min);
        
    }
}
    