import java.util.*;

public class Employee {

    private int employID;
    private String empName;
    private String empDepartment;
    private String empPosition;
    private double empPerformance;

    public Employee() {

        employID = 1;
        empName = null;
        empDepartment = null;
        empPosition = null;
        empPerformance = -1;
    }

    public Employee(int employID, String empName, String empDepartment, String empPosition, double empPerformance) {

        this.employID = employID;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empPosition = empPosition;
        this.empPerformance = empPerformance;
    }

    public void setEmployee(int employID, String empName, String empDepartment, String empPosition, double empPerformance) {

        this.employID = employID;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empPosition = empPosition;
        this.empPerformance = empPerformance;
    }

    public int getID() {

        return employID;
    }

    public String getName() {

        return empName;
    }

    public String getDepart() {

        return empDepartment;
    }

    public String getPos() {

        return empPosition;
    }
    
    public double getPerformance() {

        return empPerformance;
    }
    
    public String toString() {

        return ("ID: " + employID + " Name: " + empName + " Department: " + empDepartment + " Position: " + empPosition + " Performance: " + empPerformance);
    }
}