public class LinkList {

    private Node first;
    private Node current;
    private Node last;

    public LinkList() {

        first = null;
        last = null;
        current = null;
    }
    
    public boolean isEmpty() {
        return(first == null);
    }

    public void insertAtFront(final Employee insertItem) {
        
        final Node newNode = new Node (insertItem);

        if(isEmpty()){
            first = newNode;
            last = newNode;
        } else{ 
            newNode.next = first;
            first = newNode;
        }
    }

    public void insertAtBack(final Employee insertItem) {

        final Node newNode = new Node (insertItem);

        if(isEmpty()){
            first = newNode;
            last = newNode;
        } else{
            last.next = newNode;
            last = newNode;
        }
    }
    
    public Object removeFromFront() {

        Object removeItem = null;

        if(isEmpty()) {
            return removeItem;
        }

        removeItem = first.data;

        if(first == last) {

            first = null;
            last = null;
        } else {

            first = first.next;
        }
        
        return removeItem;
    }

    public Object removeFromBack() {

        Object removeItem = null;

        if(isEmpty()) {
            return removeItem;
        }
        removeItem = last.data;

        if(first == last) {

            first = null;
            last = null;
        } else {

            current = first;

            while(current.next != last) {
                current = current.next;
            }
            
            last = current;
            last.next = null;
        }
        
        return removeItem;
    }

    public Object getFirst() {

        if(isEmpty()) {
            return null;
        } else {
            current = first;
            return current.data;
        }
    }

    public Object getNext() {

        if(current == last) {
            return null;
        } else {
            current = current.next;
            return current.data;
        }
    }
    
    public void displayMaxPerformance() {
        Employee bestEmploy = (Employee) this.getFirst();
        Employee data = (Employee) this.getNext();
        
        while(this.getNext() != null) {
  
            if(data.getPerformance() > bestEmploy.getPerformance()){
                
                bestEmploy = data;
            }
        }
        
        System.out.println("The best employee is: " + bestEmploy.toString());
    }
    
    /*
     *  Refering to the Module's Method of Deleting Node at nth index
     */
    public void deleteInfo(int ID) {
        
         boolean found = false;
         Node current = first;
         /*
          * If the ID is equals to the first ID in the node.
          * First ID in the node = last ID 
          * entered by user due to insertAtFront()
          */
         if(first.data.getID() == ID) {
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
             while(current.next != null && found == false) {
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
    }
   

    /*
    public void deleteInfo(int ID) {
        
        boolean found = false;
        Node current = first;
        Employee eFirst = (Employee) this.getFirst();
        Employee eCurrent = (Employee) this.getNext();
        
        if(eFirst.getID() == ID) {
            first = first.next;
        } else {
            
            while(current.next != null && found == false) {
                
                if(eCurrent.getID() == ID) {
                    current.next = current.next.next;
                    found = true;
                } else {
                    current = current.next;
                }
            }

            last = current;
        }
        
    }
    */
    
    public int count() {
        
        int bil=0;
        current=first;
        
        while(current != null) {
           
            current = current.next;
            bil++;
        }
        
        return bil;
    }
}



