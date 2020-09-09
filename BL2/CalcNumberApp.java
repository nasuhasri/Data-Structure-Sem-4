import java.util.*;
import javax.swing.*;

public class CalcNumberApp
{
    public static void main(String[] args)
    {
        ArrayList <Integer> nList = new ArrayList <Integer> (10);
        
        for(int i=0; i<5; i++){
            Integer data = Integer.parseInt(JOptionPane.showInputDialog("Input data: "));
            
            nList.add(i, data);
        }
        
        for(int j=0; j<nList.size(); j++){
            Integer data = nList.get(j);
            
            if((data % 6)==0)
                nList.set(j, j*3);
            
            else
                nList.remove(j);
        }
    }
    
    /*for(int i=0; i<ContractList.size(); i++){
        W = (WeddingContract)ContractList.get(i);
        int countW=0;
        
        if(W.getVenue().equalsIgnoreCase("Hall") && W.getNumOfGuest() > 1000)
        {
            countW++;
            System.out.println("The number of wedding that will be held in hall venues with more than 1000 guests: " + countW);
        }
            
    }*/
    
    /*Scanner sc = new Scanner(System.in);
    for(int i=0; i<ContractList.size(); i++){
        W = (WeddingContract)ContractList.get(i);
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        
        if(W.getName().equalsIgnoreCase(name))
            System.out.println("Date of wedding: " + W.getDate());
            
        else
            System.out.println("Record not found!");
    }*/
    
    /*inputName.add("Farid");
    inputName.add("Ali");
    inputName.add("Fatimah");
    inputName.add("Sulaiman");
    inputName.add("Aisyah");*/
    
    /*for(int i=0; i<AllDeliveryList.size(); i++){
        D = (Delivery)AllDeliveryList.get(i);
        
        if (D.getDestination() == 'L')
        {
            System.out.println(D.toString());
        }
    }*/
    
}