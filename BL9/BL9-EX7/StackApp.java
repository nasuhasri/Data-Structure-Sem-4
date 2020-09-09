import javax.swing.*;

public class StackApp
{
    public static void main(String[] args)
    {
        Stack theStack = new Stack();
        Stack tempStack = new Stack();
        
        /*to input 5 employees into the list*/
        for(int i=0; i<5; i++){
            String eID = JOptionPane.showInputDialog("Enter employee ID: ");
            String eName = JOptionPane.showInputDialog("Enter employee name: ");
            String eAge = JOptionPane.showInputDialog("Enter employee age: ");
            String eSalary = JOptionPane.showInputDialog("Enter employee salary: ");
            
            int age = Integer.parseInt(eAge);
            double salary = Double.parseDouble(eSalary);
            
            Employee E = new Employee(eID, eName, age, salary);
            theStack.push(E);
        }
        
        /*to display all employees in the stack*/
        Object data;
        Employee E;        
        while(!theStack.isEmpty()){
            /*data in stack put into Object data*/
            data = theStack.pop();
            /*Declare data as Employee*/
            E = (Employee)data;
            System.out.println(E.toString());
            /*put into temporary stack*/
            tempStack.push(E);
        }
        
        /*Transfer all data from temp stack into original stack*/
        while(!tempStack.isEmpty()){
            data = tempStack.pop();
            E = (Employee)data;
            theStack.push(E);
        }
        
        int numAge=0, num2000=0;
        while(!theStack.isEmpty()){
            data = theStack.pop();
            E = (Employee)data;
            
            if(E.getAge() > 40){
                numAge++;
            }
            
            if(E.getSalary() > 2000){
                num2000++;
            }
            
            tempStack.push(E);
        }
        
        /*Display result*/
        System.out.println("\nThe number of employee that their age is above 40: " + numAge);
        System.out.println("The number of employee that salary is above RM2000: " + num2000);
        
        double maxSalary=-99999.99, minSalary=99999.99;
        while(!tempStack.isEmpty()){
            data = tempStack.pop();
            E = (Employee)data;
            
            if(E.getSalary() > maxSalary){
                maxSalary = E.getSalary();
            }
            else{
                minSalary = E.getSalary();
            }
            
            theStack.push(E);
        }
        
        System.out.println("The maximum salary: RM " + maxSalary);
        System.out.println("The minimum salary: RM " + minSalary);
    }
}