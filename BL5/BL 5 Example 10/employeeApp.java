import java.util.*;
import javax.swing.*;

public class employeeApp
{
    public static void main(String[] args)
    {
        Employee E=new Employee();
        LinkList theList = new LinkList();
        
        //to input 5 employees
        for(int i=0; i<5; i++){
            String eID = JOptionPane.showInputDialog("Enter employees ID: ");
            int empID = Integer.parseInt(eID);
            String eName = JOptionPane.showInputDialog("Enter name: ");
            String eDepart = JOptionPane.showInputDialog("Enter department: ");
            String ePos = JOptionPane.showInputDialog("Enter position: ");
            String ePerformance = JOptionPane.showInputDialog("Enter performance: ");
            double ePerform = Double.parseDouble(ePerformance);
            
            E = new Employee(empID, eName, eDepart, ePos, ePerform);
            theList.insertAtFront(E);
        }
        
        //Count number of employees
        int counter=0;
        counter=theList.count();
        
        System.out.println("The number of Employee(s): " + counter);
        
        //to display all the data in the Linked List after delete
        Object data = theList.getFirst();
        
        while(data != null){
            E = (Employee) data;
            System.out.println(E.toString() + " ");
            data=theList.getNext();
        }
        
        String tempID = JOptionPane.showInputDialog("Enter employees ID to be deleted: ");
        int ID = Integer.parseInt(tempID);
        theList.deleteInfo(ID);
        
        data = theList.getFirst();
        System.out.println("List all data after delete: ");
        while(data != null) {
            
            E = (Employee) data;
            System.out.println(E.toString());
            data = theList.getNext();
        }
        
        //Display the best performance
        theList.displayMaxPerformance();
    }
}