public class Employee
{
    private int empID;
    private String empName;
    private String empDepartment;
    private String empPosition; // manager, clerk, programmer..
    private double empPerformance;
    
    public Employee(){
        empID=-1;
        empName="";
        empDepartment="";
        empPosition="";
        empPerformance=-1;
    }
    
    public Employee(int empID, String empName, String empDepartment, String empPosition, double empPerformance){
        this.empID=empID;
        this.empName=empName;
        this.empDepartment=empDepartment;
        this.empPosition=empPosition;
        this.empPerformance=empPerformance;
    }
    
    public void setEmployee(int ID, String Name, String Department, String Position, double Performance){
        empID=ID;
        empName=Name;
        empDepartment=Department;
        empPosition=Position;
        empPerformance=Performance;
    }
    
    public int getID(){
        return empID;
    }
    
    public String getName(){
        return empName;
    }
    
    public String getDepart(){
        return empDepartment;
    }
    
    public String getPos(){
        return empPosition;
    }
    
    public double getPerformance(){
        return empPerformance;
    }
    
    public String toString(){
        return ("ID: " + empID + "\nName: " + empName + "\nDepartment: " + empDepartment + 
        "\nPosition: " + empPosition + "\nPerformance: " + empPerformance + "\n");
    }
    
}