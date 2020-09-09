import javax.swing.*;
public class TreeApp2
{
    public static void main(String[] args)
    {
        BSTree2 theTree = new BSTree2();
        theTree.insertNode(6);
        theTree.insertNode(7);
        theTree.insertNode(8);
        theTree.insertNode(5);
        theTree.insertNode(3);
        theTree.insertNode(5);
        theTree.insertNode(9);
        
        System.out.print("PreOrder Traversal: ");
        theTree.preOrderTraversal();
        System.out.print("\nInOrder Traversal: ");
        theTree.inOrderTraversal();
        System.out.print("\nPostOrder Traversal: ");
        theTree.postOrderTraversal();
        
        System.out.println("\n\nThe number of nodes in the tree: ");
        System.out.println(theTree.countNodeAll());
        
        System.out.println("\n\nThe number of even nodes in the tree: ");
        System.out.println(theTree.countEvenAll());
        
        System.out.println("\n\nThe sum of elements in the tree: ");
        System.out.println(theTree.calcSumAll());
        
        int iNum = Integer.parseInt(JOptionPane.showInputDialog("Insert multiple do you wish to be diplayed"));
        
        System.out.println("\n\nThe Smultiple" + iNum + "nodes: ");
        theTree.displayMultipleAll(iNum);
    }
}