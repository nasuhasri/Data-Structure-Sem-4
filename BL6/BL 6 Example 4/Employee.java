import javax.swing.*;

public class Employee
{
    private int empID;
    private String empName;
    private String empDept;
    private String empPost;
    private double empPerformance;
    
    public Employee(){
        empID=0;
        empName= " ";
        empDept= " ";
        empPost= " ";
        empPerformance=0.0;
    }
    
    public Employee(int empID, String empName, String empDepartment, String empPosition, double empPerformance){
        this.empID=empID;
        this.empName=empName;
        this.empDept=empDepartment;
        this.empPost=empPosition;
        this.empPerformance=empPerformance;
    }
    
    public void setEmployee(int ID, String Name, String Department, String Position, double Performance){
        empID=ID;
        empName=Name;
        empDept=Department;
        empPost=Position;
        empPerformance=Performance;
    }
    
    public int getID(){
        return empID;
    }
    
    public String getName(){
        return empName;
    }
    
    public String getDepart(){
        return empDept;
    }
    
    public String getPos(){
        return empPost;
    }
    
    public double getPerformance(){
        return empPerformance;
    }
    
    public String toString(){
        return ("ID: " + empID + "\nName: " + empName + "\nDepartment: " + empDept + 
        "\nPosition: " + empPost + "\nPerformance: " + empPerformance + "\n");
    }
}