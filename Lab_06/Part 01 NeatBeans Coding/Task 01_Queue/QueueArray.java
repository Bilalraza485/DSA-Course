/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue_;

/**
 *
 * @author Bilal Raza
 */
public class QueueArray {
    
  int []queue;
  int capacity;
  int size;
  int front;
  int rear;
  
  public QueueArray(int capacity){
      this.capacity = capacity;
      queue = new int[capacity];
      size=0;
      front = 0;
      rear = -1;
  }
    
  //Method to check the Queue isFull
    boolean isFull(){
     return size == capacity;
     
    }
    
    //check the Queue is Empty 
    boolean isEmpty(){
        return size == 0;
    }
    
    
    //Adds an element to the rear of the queue.
   public void enqueue(int data){
       if(isFull()){
           System.out.println("Queue Is overflow"+data);
       }
       rear = (rear+1)%capacity;
       queue[rear]=data;
       size++;
       System.out.println("Enqueued Value is "+data);
   }
    
   //Removes and returns the front element.
    public int Dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Underflow");
        }
        int value = queue[front];
        front = (front +1)%capacity;
        size--;
        System.out.println("Dequeued Value "+value);
        return -1;
    }
     
     public int size(){
         return size;
     }

     // Returns the front element without removing it.
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot peek.");
            return -1;
        }
        return queue[front];
    }     
    
    
    public static void main(String args[]){
        QueueArray list = new QueueArray(5);
        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);
        list.enqueue(40);
        list.enqueue(50);
        list.Dequeue();
        System.out.println("Peek value is "+list.peek());
    }
}

