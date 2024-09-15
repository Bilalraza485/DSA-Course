/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dsa.lab_03;

/**
 *
 * @author Bilal Raza
 */
public class Linkedlist {
 
    int list_size=0;

    
    // Creste A Node Class In Linkedlist 
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;
    Linkedlist(){
        this.head=null;
    }
    
    //Method to Insert At Start In Linkedlist
    public void inserAtStart(int data){
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }
    
    
      //Method To Insert At End In Linkedlist 
    public void insertionAtend(int data){
        Node newNode = new Node(data);
    if (head == null) {
        head = newNode;
    } else {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    } 
    }
    
    
       //Method to Insert At Position In linked List 
    public void InsertAtPosition(int data, int position){
        int count =0;
        Node current =head;
        Node newNode=new Node (data);
        while(current != null){
            if(count == position){
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
            }
            current = current.next;
            count++;
        }
    }
   
    
    //Method To Delete At Start In LinkedList
    public void deleteAtStart(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head=head.next;
    }
   
    
    //Method to Delete At End in Linkedlist
    public void deleteatend(){ 
   if (head == null) {
        System.out.println("The list is empty");
        return;
    }
    if (head.next == null) {
        head = null;
        return;
    }
    Node current = head;
    while (current.next.next != null) {
        current = current.next;
    }
    current.next = null;
    }
   
 
    //Method to Delete By Value in linkedlist
    public void DeleteByValue(int value){
        if(head == null){
            System.out.println("List is empty");}
            else{
            Node current=head;
                  while(current.next != null){ 
                      if(current.data == value){
                          current.next = current.next.next;
                      }
                      current = current.next;
                  }
        }
    }
    
    // Method to Search By Value in Linkedlist
    public void Search(int value){
        boolean mark=false;
        int count= 0;
        Node current=head;
        while(current != null){
            if(current.data==value){
                mark=true;
                break;
            }
             else{
                mark=false;}
                current = current.next;
                count ++;
            }
                if(mark==true){
                    System.out.println("FOUND AT POSITION ->"+count);}
                    else{
                            System.out.println("Value not Found");
                            }
            
        }
    
    
    // Method to Reverse the linkedlit
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node nextNode;

        while (current != null) {
            nextNode = current.next; 
            current.next = prev;     
            prev = current;          
            current = nextNode;
        }
        head = prev; 
    }
    
     // Method to count the number of nodes in the linked list
    int countNodes() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
       //Method to Find the Size of Linedlist 
    public void size(){
        int size=0;
        if(head==null){
            System.out.println(size);
            return;
        }
        Node current = head;
        while(current != null){
            size++;
            current = current.next;
        }
        System.out.println(size);
    }
    
    
       // Method to Diplay the list In linkedlist
    public void display(){
        if(head==null){
         System.out.println("the list is empty");   
        }
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
        
    }
    
    public static void main(String[] args) {
       Linkedlist list = new Linkedlist();
       
        System.out.println("----------A----------");
        System.out.println("--INSERTION AT START--");
       list.inserAtStart(10);
       list.inserAtStart(20);
       list.inserAtStart(30);
       list.inserAtStart(40);
       list.display();
       
        System.out.println("INSERTION AT END:");
        list.insertionAtend(70);
        list.display();
       
         System.out.println("INSERT AT POSITION");
        list.InsertAtPosition(15, 2);
        list.display();
        
        System.out.println("--------B--------");
        System.out.println("--DELETETION AT START--");
       list.deleteAtStart();
       list.display();
      
        System.out.println("DELETION AT END");
        list.deleteatend();
        list.display();
        
        System.out.println("DELETE BY VALUE");
       list.DeleteByValue(30);
       list.display();
       

        System.out.println("--------C-------");
        list.Search(15);
        list.display();
        
        System.out.println("REVERSE THE LIST");
        list.reverse();
        list.display();
        
        
        int nodeCount = list.countNodes();
        System.out.println("NUMBER OF NODES: " + nodeCount);
        list.display();
        
        
          System.out.println("--SIZE OF LIST--");
       list.size();
       
       
    }
    }
    
