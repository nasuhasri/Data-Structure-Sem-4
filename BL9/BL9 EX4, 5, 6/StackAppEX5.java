import javax.swing.*;

public class StackAppEX5
{
    public static void main(String[] args){
        /*declare stack variable*/
        Stack theStack = new Stack();
        Stack tempStack = new Stack();        
        String num;
        
        /*Enter string num into stack*/
        for(int i=0; i<3; i++){
            num = JOptionPane.showInputDialog("Enter a number: ");
            theStack.push(num);
        }
        
        /*display data in the stack*/
        Object data=null;
        System.out.println("DATA IN THE STACK: ");
        while(!theStack.isEmpty()){
            data = theStack.pop();
            System.out.println(data);
            tempStack.push(data);
        }
    }
}