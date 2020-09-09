public class Node {
    
    /*
     *  Refering to the module. The module mentioned the usage of Object class as the data type of variable data.
     *  But, if we wanted to use our predefined classes. We have to change the Object Class to our Predefined Class.
     *  In this case, the variable data should be:
     *  
     *      public Employee data;
     *  
     *  And also the parameter of the constructor,
     *  
     *      public Node(Employee obj)
     *      
     *  The object class do contains a lot of predefined method. But, if we need to use our method. We have to change
     *  the data type. :)
     */
    
    public Employee data;
    public Node next;
    
    public Node(Employee obj) {
        data = obj;
    }
}
