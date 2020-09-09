import java.util.ArrayList;
import javax.swing.*;

public class student
{
    private int studentID;
    private String name;
    private int part;
    private double cgpa;
    
    public student(){
        
    }
    
    public student(int i, String n, int p, double c){
        this.studentID = i;
        this.name = n;
        this.part = p;
        this.cgpa = c;
    }
    
    public void setStudent(int i, String n, int p, double c){
        studentID = i;
        name = n;
        part = p;
        cgpa = c;
    }
    
    public int getID(){
        return studentID;
    }
    
    public String getName(){
        return name;
    }
    
    public int getPart(){
        return part;
    }
    
    public double getCgpa(){
        return cgpa;
    }
    
    public String toString(){
        return("ID: " + studentID + ", Name: " + name + ", Part: " + part + ", CGPA: " + cgpa);
    }
}