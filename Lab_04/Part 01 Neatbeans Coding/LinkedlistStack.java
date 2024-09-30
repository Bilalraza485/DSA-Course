/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_04_stack;

/**
 *
 * @author Bilal Raza
 */
public class LinkedlistStack {
     class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


    private Node top;

    // Constructor
    public LinkedlistStack() {
        this.top = null;
    }

    // Adds an element to the top of the stack.
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed to stack.");
    }

     // Pop: Removes and returns the top item.
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Indicating stack is empty
        }
        int poppedData = top.data;
        top = top.next;
        return poppedData;
    }

    //Peek: Returns the top item without removing it.
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1; // Indicating stack is empty
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display the contents of stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        Node current = top;
        System.out.print("Stack: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }



     
    public static void main(String[] args) {
        LinkedlistStack stack = new LinkedlistStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display(); // Display stack

        System.out.println(stack.pop() + " popped from stack.");
        stack.display(); // Display stack after popping

        System.out.println("Top element is: " + stack.peek());
    }
}
