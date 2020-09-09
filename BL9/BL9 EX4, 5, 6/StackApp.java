import javax.swing.*;

public class StackApp
{
    public static void main(String[] args){
        /*Declare stack variable*/
        Stack theStack = new Stack();
        Stack tempStack = new Stack();
        
        /*to push data into stack*/
        theStack.push("7");
        theStack.push("3");
        theStack.push("12");
        
        /*to get and print data on the top of the stack*/
        System.out.println("DATA ON THE TOP OF THE STACK : ");
        System.out.println(theStack.peek());
        
        /*to remove and print all data in the stack*/
        Object data=null;
        System.out.println("DATA IN THE STACK : ");
        while(!theStack.isEmpty()){
            data = theStack.pop();
            System.out.println(data);
            tempStack.push(data);
        }
    }
}