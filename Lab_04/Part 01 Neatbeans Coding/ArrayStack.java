/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_04_stack;

/**
 *
 * @author Bilal Raza
 */
public class ArrayStack {
    private int[]stack;
    private int top;
    private int capacity;
    
    
    // (size)Returns the number of elements in the stack.
    public ArrayStack(int size){
        stack = new int[size];
        capacity = size;
        top =-1;
    }
    
    
    // Adds an element to the top of the stack.
    public void push(int item){
        if (top == capacity -1){
            System.out.println("Stack is Overflow");
            return ;
        }
        stack[++top]=item;
    }
    
    
    // Pop: Removes and returns the top item.
    public int pop(){
        if(top == -1){
            System.out.println("Stack is UnderFlow");
            return -1;
        }
        return stack[top-1];
    }
    
    
      //Peek: Returns the top item without removing it.
    public int peek(){
       
       return stack[top];
    }
    
    
    // Checks if the stack is empty.
    public int isempty(){
        return top -1;
    }
    
    
    
    
    // Display the contents of the stack
      public void Display(){
        if (top == -1){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack Contents");
    for(int i=top; i>=0; i--){
            System.out.println(stack[i]+ "");
}
        System.out.println();
    }
    
      
    public static void main (String args[]){
        ArrayStack list = new ArrayStack(5);
        list.push(10);
        list.push(20);
        list.push(30);
        list.Display();
       
       
        System.out.println("Top Element is "+ list.peek());
    } 
}
