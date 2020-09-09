import java.util.ArrayList;
import java.util.*;

public class BL2
{
    public static void main(String[] args)
    {
        ArrayList <Integer> list=new ArrayList <Integer> ();
        int data, index=0;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<10; i++){
            data=(3*i) + 5;
            
            if(data%4==0)
            {
                list.add(data);
            }
            
            else if(data%2==0)
            {
                list.add(index,data);
                index++;
            }
            
            System.out.println(data + "");
            //System.out.println(list.toString());
        }
        
        /*ArrayList <Integer> markList = new ArrayList <Integer> ();
        for(int i=0; i<markList.size(); i++){
            System.out.println("Enter 4 integer numbers: ");
            int num=sc.nextInt();
            markList.add(num);
        }
        
        for(int i=0; i<markList.size(); i++){
            int ind=markList.get(1);
            System.out.println("The second integer number in the markList: " + ind);
            markList.remove(0);
        }*/
        
        /*for(int i=0; i<studentList.size(); i++){
            S=(Student)studentList.get(i);
            
            if(S.getStudentID().equalsIgnoreCase("200123")){
                studentList.remove(i);
            }
            
            else
                System.out.println("Record not found");
            
        }
        
        for(int i=0; i<studentList.size(); i++){
            S=(Student)studentList.get(i);
            
            if(S.getGender()=='f' || S.getGender()=='F'){
                System.out.println("Name: " + S.getName(i);
                System.out.println("Student ID: " + S.getStudentID(i));
            }
        }*/
        
    }
}