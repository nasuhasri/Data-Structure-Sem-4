import java.util.*;
import javax.swing.JOptionPane;

public class employeeApp {

    public static void main() {
        System.out.println();
        // Object declaration
        Employee E = new Employee();
        LinkList list = new LinkList();
        
        // Ask user to input the data
        for(int i=0; i<5; i++) {

            String eID= JOptionPane.showInputDialog("Enter employee id");
            int epmID = Integer.parseInt(eID);
            String eName = JOptionPane.showInputDialog("Enter name");
            String eDepart = JOptionPane.showInputDialog("Enter department");
            String ePos = JOptionPane.showInputDialog("Enter position");
            String ePerformance = JOptionPane.showInputDialog("Enter performance");
            double ePerform = Double.parseDouble(ePerformance);
            E = new Employee(epmID, eName, eDepart, ePos, ePerform);
            // Send data to normal constructor
            list.insertAtFront(E);

        }
        
        int counter = 0;
        counter = list.count();
        
        System.out.println("The number of Employees: " + counter);
        
        // Calling the first node in the LinkedList
        Object data = list.getFirst();
        
        // Display the data 
        while(data != null) {

            E = (Employee) data;
            System.out.println(E.toString());
            data = list.getNext();
        }
        
        System.out.println();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter employee ID to be deleted: "));
        
        list.deleteInfo(id);

        data = list.getFirst();
        System.out.println("\nList all data after delete: \n");
        while(data != null) {
            
            E = (Employee) data;
            System.out.println(E.toString());
            data = list.getNext();
        }
        
        list.displayMaxPerformance();
    }
}