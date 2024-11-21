/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab09_bst;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Bilal Raza
 */

// Create a Node For BST 
class Node{
    int value;
    Node left;
    Node right;
    
    Node(int value){
        this.value=value;
        this.left=null;
        this.right=null;
    }
}

public class BST {
    Node root;
    
    public BST(){
        this.root=null;
    }
    
    
    // Ctreate a Method of Insertion 
    public void Insertion(int value){
        root=InsertRec(root, value);
    }
    
     Node InsertRec(Node node, int value){
        if(node == null){
           
            return new Node(value);
        }
        // If Value is Less than root then current node go to the left,
        if(value < node.value){
           node.left = InsertRec(node.left, value);
        }
         // If Value is greater than root then current node go to the right,
        if(value > node.value){
            node.right = InsertRec(node.right, value);
        }
        return node;
    }
     
     // Method to countNode in BST 
     int countNode(){
         return countNodeRec(root);
         
     }
    int countNodeRec(Node root ){
        if(root == null){
            return 0;
        }
        return 1+ countNodeRec(root.left) + countNodeRec(root.right);
    }
    
    //Method to Search Value in BST
    public boolean search(int value) {
        return Search(root, value);
    }
    // Helper method to search for a value recursively
    private boolean Search(Node root, int value){
        if(root == null){
            return false;
        }
        
        if(root.value == value){
            return true;
    }
       if(value < root.value){
           return Search(root.left, value);
       }
      else{
           return Search(root.right, value);
       }
    }
    
    // In-order traversal: Left, Root, Right
    public void Inorder(){
       InorderRec(root);
    }
    
    public void InorderRec(Node root){
        if(root != null){
           InorderRec(root.left);
            System.out.print( root.value+ " ");
            InorderRec(root.right);
        }
}

    // Pre-order traversal: Root, Left, Right
        void PreOrder(){
          PreOrderRec(root);
        }
        
    public void PreOrderRec(Node root){
        if(root != null){
            System.out.print(root.value+ " ");
            PreOrderRec(root.left);
            PreOrderRec(root.right);
        }
    }
    
     // Post-order traversal: Left, Right, Root
        void Postorder(){
            PostorderRec(root);
        }
    
    public void PostorderRec(Node root){
        if(root != null){
            PostorderRec(root.left);
            PostorderRec(root.right);
            System.out.print(root.value +" ");
        }
    }
    
     // Level-order traversal: Level by level from left to right
    void levelOrder() {
        if (root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.value + " ");

            // Enqueue the left child
            if (current.left != null) {
                queue.add(current.left);
            }

            // Enqueue the right child
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }
    
   
    public static void main (String args[]){
        BST tree = new BST();
        tree.Insertion(50);
        tree.Insertion(30);
        tree.Insertion(20);
        tree.Insertion(40);
        tree.Insertion(70);
        tree.Insertion(80);
     
        System.out.println("Total Number of the Node "+   tree.countNode());
       System.out.println("Searching for 20 in the BST: " + tree.search(20));
        System.out.println("Searching for 60 in the BST: " + tree.search(60));
        System.out.println("Searching for 90 in the BST: " + tree.search(90));
        
       
     
       // Display the Traverasals of the BST
        System.out.println("\nDisplay the Traverasals of the BST");
        System.out.println("In-order traversal:");
        tree.Inorder();
        System.out.println(" ");
        System.out.println("Pre-order traversal:");
        tree.PreOrder();
        System.out.println(" ");
        System.out.println("Post-order traversal:");
        tree.Postorder();
        System.out.println(" ");
        System.out.println("Level-order traversal:");
        tree.levelOrder();
    }
}