
public class LinkList
{
    public Node first;   // ref to first node in the list
    public Node current; // ref to current node in the list
    public Node last;    // ref to last node in the list
    
    public LinkList(){
        first=null;
        current=null;
        last=null;
    }
    
    public boolean isEmpty(){
        return (first==null);
    }
    
    public void insertAtFront(Employee insertItem){
        Node newNode=new Node(insertItem);
        
        if(isEmpty()){
            first=newNode;
            last=newNode;
        }
        
        else{
            newNode.next=first;
            first=newNode;
        }
        
    }
    
    public void insertAtBack(Employee insertItem){
        Node newNode=new Node(insertItem);
        
        if(isEmpty()){
            first=newNode;
            last=newNode;
        }
        
        else{
            last.next=first;
            last=newNode;
        }
    }
    
    public Object removeFromFront(){
        Object removeItem=null;
        
        if(isEmpty()){
            return removeItem;
        }
        
        removeItem=first.data;
        
        if(first==last){
            first=null;
            last=null;
        }
        
        else
            first=first.next;
            
        return removeItem;
    }
    
    public Object removeFromBack(){
        Object removeItem=null;
        
        if(isEmpty()){
            return removeItem;
        }
        
        removeItem=last.data;
        
        if(first==last){
            first=null;
            last=null;
        }
        
        else{
            current=first;
            while(current.next!=last)
                current=current.next;
                
            last=current;
            last.next=null;
        }
            
        return removeItem;
    }
    
    public Object getFirst(){
        if(isEmpty())
            return null;
        
        else{
            current=first;
            return current.data;
        }
    }
    
    public Object getNext(){
        if(current==last)
            return null;
        
        else{
            current=current.next;
            return current.data;
        }
        
    }
    
    public int count(){
        int bil=0;
        current=first;
        
        while(current!=null){
            current=current.next;
            bil++;
        }
        
        return bil;
    }
    
    public void displayMaxPerformance(){
        Node bestEmploy = first;
        //Simpan current node punya object
        Node val = current;
        
        while(val != null){
            if(val.data.getPerformance() > bestEmploy.data.getPerformance()){
                bestEmploy=val;
            }
            
            val = current.next;
        }
        
        System.out.println("The best Employee is: " + "\n" + bestEmploy.data.toString());
    }
    
    public void deleteInfo(int ID){        
        boolean found=false;
        Node current=first;
        
        //First node masuk condition ni
        if(first.data.getID()==ID){
            first=first.next;
        }
        
        //Not first node enter this condition
        //Kena check satu satu ID so buat dlm while loop
        //Current node=node ke-2 till 5
        //Node 5 = current & last
        else{
            //Bila first time masuk looping, node dlm current is first node
            //So kena buat current.next
            while(current.next!=null && found==false){
                //user input ID=2 then found
                if(current.next.data.getID() == ID) {
                    //To allow comp to check ada value lagi tak dlm 'current.next.next'
                    //Kalau ada, transfer value kpd node sebelumnya
                    if(current.next.next != null) {
                        //user input ID = 2
                        //transfer value Node 3 to Node 2
                        current.next = current.next.next;
                    } 
                    
                    else {
                        //inform computer. last node takda value so lastNode = currentNode
                        last = current;
                    }
                    
                    //terminate loop
                    found = true;
                } 
                
                //Kalau belum jumpa ID=2, masuk else statement
                else {
                     current = current.next;
                }
            }
        }
    }
    
    /*public void deleteInfo(int ID) {
        
         boolean found = false;
         Node current = first;
         /*
          * If the ID is equals to the first ID in the node.
          * First ID in the node = last ID 
          * entered by user due to insertAtFront()
          */
         /*if(first.data.getID() == ID) {
             first = first.next;
         } else {
             /*
              * The flow to this code is pretty amazing!
              * The logic goes like this. 
              * For ever iteration, the code will go to the else statement
              * until the node with the same ID entered by user is found.
              * Once it is reaching the else statement, 
              * current node will next node in the list.
              * 
              * Whereas, when ID of a node is found. 
              * The code will go throught the if statement.
              * The next next value will replace the next node value. 
              * The found statement is use to terminate the loop.
              */
             /*while(current.next != null && found == false) {
                 if(current.next.data.getID() == ID) {

                    if(current.next.next != null) {
                        current.next = current.next.next;
                    } else {
                        last = current;
                    }
                    
                    found = true;
                 } else {
                     current = current.next;
                 }
             }
         }
    }*/
    
    
    
}