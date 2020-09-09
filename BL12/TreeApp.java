public class TreeApp
{
    public static void main(String[] args)
    {
        BSTree theTree = new BSTree();
        
        theTree.insertNode(6);
        theTree.insertNode(7);
        theTree.insertNode(8);
        theTree.insertNode(5);
        theTree.insertNode(3);
        theTree.insertNode(5);
        
        System.out.print("PreOrder Traversal : ");
        theTree.preOrderTraversal();
        System.out.print("\nInOrder Traversal: ");
        theTree.inOrderTraversal();
        System.out.print("\nPostOrder Traversal: ");
        theTree.postOrderTraversal();
    }
    
    

    
    
    

}