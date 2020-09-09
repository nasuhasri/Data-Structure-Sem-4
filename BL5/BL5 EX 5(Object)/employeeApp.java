import java.util.*;
import javax.swing.*;

public class employeeApp
{
    public static void main(String[] args)
    {
        Employee E=new Employee();
        LinkList List=new LinkList();
        
        //to input 5 employees
        for(int i=0; i<5; i++)
        {
            String eID = JOptionPane.showInputDialog("Enter employee ID: ");
            int empID = Integer.parseInt(eID);
            String eName = JOptionPane.showInputDialog("Enter name: ");
            String eDepart = JOptionPane.showInputDialog("Enter department: ");
            String ePos = JOptionPane.showInputDialog("Enter position: ");
            String ePerformance = JOptionPane.showInputDialog("Enter performance: ");
            double ePerform = Double.parseDouble(ePerformance);
            
            E=new Employee(empID, eName, eDepart, ePos, ePerform);
            List.insertAtFront(E);
        }
        
        //to display all the employee
        Object data = List.getFirst();
        while(data!=null){
            E=(Employee) data;
            System.out.println(E.toString());
            data=List.getNext();
        }
        
        //to find the best performance of Employee
        //to count the number of employees in IT Department
        //to count the number of employees who performance is 80 above
        int counterIT=0, counter80=0, indMax=0;
        double maxPerform=0.0;
        Object ObjectMax=null;
        data=List.getFirst();
        while(data!=null){
            E=(Employee) data;
            
            if(E.getPerformance() > maxPerform){
                maxPerform = E.getPerformance();
                ObjectMax = E;
            }
            
            if(E.getDepart().equalsIgnoreCase("IT")){
                counterIT++;
            }
            
            if(E.getPerformance() >= 80){
                counter80++;
            }
            
            //To get the next data of employee
            data=List.getNext();
        }
        
        System.out.println("The best employee is: ");
        System.out.println(ObjectMax.toString());
        
        System.out.println("There are " + counterIT + " employee(s) of IT Department");
        System.out.println("There are " + counter80 + " employee(s) whose get the 80 and above of the performance");
        
    } // mainApp
} // EmployeeApp