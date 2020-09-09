import javax.swing.*;
import java.util.*;

public class employeeApp
{
    public static void main(String[] args)
    {
        Employee E = new Employee(); //declare obj E of class Employee
        Queue theQueue = new Queue(); //declare obj theQueue of class Queue
        Queue tempQueue = new Queue(); // declare obj tempQueue of class Queue
        
        //to input 5 employees
        for(int i=0; i<5; i++){
            String eID = JOptionPane.showInputDialog("Enter employee ID: ");
            int empID = Integer.parseInt(eID);
            String eName = JOptionPane.showInputDialog("Enter name: ");
            String eDept = JOptionPane.showInputDialog("Enter department: ");
            String ePost = JOptionPane.showInputDialog("Enter position: ");
            String ePerformance = JOptionPane.showInputDialog("Enter performance: ");
            double ePerform = Double.parseDouble(ePerformance);
            
            //insert all data into obj named E using normal constructor
            E = new Employee(empID, eName, eDept, ePost, ePerform);
            //insert data from object E into theQueue
            theQueue.enqueue(E);
        }
        
        //to display all data of employee
        while(!theQueue.isEmpty()){
            //casting data from theQueue insert into E
            E = (Employee)theQueue.dequeue(); 
            //display on screen
            System.out.println(E.toString());
            //data from E insert into object named tempQueue
            tempQueue.enqueue(E);
        }
        
        //to find the best performance of employee
        //to count the number of employee in IT dept
        //to count the number of employee who performance is 80 and above
        int countIT=0, count80=0;
        double maxPerform=0.0;
        
        Employee bestEmployee=null;
        while(!tempQueue.isEmpty()){
            E = (Employee) tempQueue.dequeue();
            
            if(E.getPerformance() > maxPerform){
                maxPerform = E.getPerformance();
                bestEmployee = E;
            }
            
            if(E.getDepart().equalsIgnoreCase("IT")){
                countIT++;
            }
            
            if(E.getPerformance() >= 80){
                count80++;
            }
            
            theQueue.enqueue(E);
        }
        
        System.out.println("The best employee: ");
        System.out.println(bestEmployee.toString());
        System.out.println("There are " + countIT + " employee(s) of the IT department");
        System.out.println("There are " + count80 + " employee(s) whose get the 80 and above of the performance");
    } //main
} //EmployeeApp