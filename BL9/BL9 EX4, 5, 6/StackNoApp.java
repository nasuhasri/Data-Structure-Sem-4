import javax.swing.*;

public class StackNoApp
{
    public static void main(String[] args){
        Stack myStack = new Stack();
        Stack tempStack = new Stack();
        String num;
        
        /*push data into stack*/
        for(int i=0; i<3; i++){
            num = JOptionPane.showInputDialog("Enter a number: ");
            myStack.push(num);
        }
        
        /*Calculation on items in stack
          Find number of items, sum, max, min*/
        int count=0, sum=0, min=99999, max=-99999;
        while(!myStack.isEmpty()){
            /*String number from stack masuk dalam Object data*/
            Object data = myStack.pop();
            count++;
            /*Change data from string to int*/
            /*Dalam class Object ada method public String toString()
               so nanti dia akan return dlm bentuk String*/
            int no = Integer.parseInt(data.toString());
            sum = sum + no;
            if(no > max){
                max = no;
            }
            
            if(no < min){
                min = no;
            }
            /*Push data into tempStack*/
            tempStack.push(data);
        }        
        double avg = sum / count;
        
        /*Print result*/
        JOptionPane.showMessageDialog(null, "There are " + count + " items in the stack");
        JOptionPane.showMessageDialog(null, "The sum of all items in the stack is " + sum);
        JOptionPane.showMessageDialog(null, "The minimum is " + min);
        JOptionPane.showMessageDialog(null, "The maximum is " + max);
    }
}