import javax.swing.*;

public class Employee
{
    private String empID;
    private String empName;
    private int empAge;
    private double empSalary;    
    
    public Employee(){
        empID=" ";
        empName= " ";
        empAge=0;
        empSalary=0.0;
    }
    
    public Employee(String empID, String empName, int empAge, double empSlry){
        this.empID=empID;
        this.empName=empName;
        this.empAge=empAge;
        this.empSalary=empSlry;
    }
    
    public void setEmployee(String ID, String Name, int age, double salary){
        empID=ID;
        empName=Name;
        empAge=age;
        empSalary=salary;
    }
    
    public String getID(){
        return empID;
    }
    
    public String getName(){
        return empName;
    }
    
    public int getAge(){
        return empAge;
    }
    
    public double getSalary(){
        return empSalary;
    }
    
    
    public String toString(){
        return ("ID: " + empID + "\nName: " + empName + "\nAge: " + empAge + "\nSalary: RM " + empSalary);
    }
}