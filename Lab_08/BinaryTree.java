/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_09.binarytree;

/**
 *
 * @author Bilal Raza
 */

import java.util.LinkedList;
import java.util.Queue;


class Node{
    int value;
    Node left, right;
    
    public Node(int value){
        this.value=value;
        this.left=right=null;
    }
}



public class BinaryTree {
      Node root;
    
    public BinaryTree(){
        this.root=null;
    }
    
    void InsertValue(int value){
        root = insertRec(root, value);
    }
    
    Node insertRec(Node root, int value){
        if (root == null){
            root = new Node(value);
            return root;
        }
        if (value < root.value){
            root.left = insertRec(root.left, value);
        }
        if (value > root.value){
        root.right = insertRec(root.right, value);
    }
        return root;
    }

    
         // In-order traversal: Left, Root, Right
  void inorder(){
      inorderRec(root);
  }
    void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.print(root.value+" ");
            inorderRec(root.right);
        }
    }
    
    
     // Pre-order traversal: Root, Left, Right
    void preorder(){
        preorderRec(root);
    }
    
    void preorderRec(Node root){
        if(root != null){
            System.out.print(root.value +" ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }
    
    
     // Post-order traversal: Left, Right, Root
    void postorder(){
        postorderRec(root);
    }
    
    void postorderRec(Node root){
        if(root != null){
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.value + " ");
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

   
    public static void main(String []args){
        BinaryTree tree = new BinaryTree();
        
          // Insert nodes into the binary tree
        tree.InsertValue(50);
        tree.InsertValue(30);
        tree.InsertValue(20);
        tree.InsertValue(40);
        tree.InsertValue(70);
        tree.InsertValue(60);
        tree.InsertValue(80);
        
              // Display traversals of the binary tree
        System.out.println("In-order traversal:");
        tree.inorder();
        System.out.println(" ");
        System.out.println("Pre-order traversal:");
        tree.preorder();
        System.out.println(" ");
        System.out.println("Post-order traversal: ");
        tree.postorder();
        System.out.println("\nLevel-order traversal:");
        tree.levelOrder();
        
    }
}
