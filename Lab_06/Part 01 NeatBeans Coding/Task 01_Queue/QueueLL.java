/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author Bilal Raza
 */
public class QueueLL {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    private Node front;
    private Node rear;
    
    public QueueLL(){
        this.front=null;
        this.rear=null;
    }
    
    public void Enquwue(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
         return;
         
        }
        newNode.next=rear;
        rear = newNode;
        System.out.println("Enqueued Value "+data);
    }
    
      public int dequeue(){
        if(rear==null){
            System.out.println("Queue is empty");
                front = rear =null;
                return-1;
    }
        int value = front.data;
        front=front.next;
        return value;
}
    
    public int Peek(){
        return rear.data;
    }
    
    public static void main(String args[]){
        QueueLL list = new QueueLL();
        list.Enquwue(10);
        list.Enquwue(20);
        list.Enquwue(30);
        System.out.println("Dequeued Value is "+list.dequeue());
        System.out.println("Value on peek is "+list.Peek());
    }
}
