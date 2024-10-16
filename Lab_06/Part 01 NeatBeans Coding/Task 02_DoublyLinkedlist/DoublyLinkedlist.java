/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue_;

/**
 *
 * @author Bilal Raza
 */
public class DoublyLinkedlist {
    class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

    private Node head;
    private Node tail;
    
    public DoublyLinkedlist() {
        head = null;
        tail = null;
    }

    // Add a node at the start
    public void addAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add a node at the end
    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add a node at a specific position
    public void addAtPosition(int data, int position) {
        if (position < 0 || (head == null && position > 0)) {
            System.out.println("Invalid position.");
            return;
        }
        if (position == 0) {
            addAtStart(data);
            return;
        }
        
        Node newNode = new Node(data);
        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < position - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            System.out.println("Position is greater than the length of the list.");
            return;
        }

        newNode.next = current.next;
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }
        current.next = newNode;
    }

    // Delete a node from the start
    public void deleteFromStart() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    // Delete a node from the end
    public void deleteFromEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // Delete a node by value
    public void deleteByValue(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.data == data) {
            deleteFromStart();
            return;
        }

        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Value not found.");
            return;
        }

        if (current == tail) {
            deleteFromEnd();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // Display from start
    public void displayFromStart() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display from end
    public void displayFromEnd() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    // Search for a value
    public void search(int data) {
        Node current = head;
        int position = 0;

        while (current != null) {
            if (current.data == data) {
                System.out.println("Value found at position: " + position);
                return;
            }
            current = current.next;
            position++;
        }
        System.out.println("Value not found.");
    }

    // Reverse the list
    public void reverse() {
        if (head == null) {
            return;
        }

        Node current = head;
        Node temp = null;

        // Swap the next and prev pointers for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        // Swap the head and tail pointers
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Count the number of nodes in the list
    public int countNodes() {
        Node current = head;
        int count = 0;
        
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // Main method to test and validate the doubly linked list
    public static void main(String[] args) {
        DoublyLinkedlist list = new DoublyLinkedlist();

        list.addAtStart(10);
        list.addAtEnd(20);
        list.addAtStart(5);
        list.addAtPosition(15, 2);

        System.out.println("List after adding elements:");
        list.displayFromStart();

        list.deleteFromStart();
        System.out.println("List after deleting from start:");
        list.displayFromStart();

        list.deleteFromEnd();
        System.out.println("List after deleting from end:");
        list.displayFromStart();

        list.search(15);
        list.search(30);

        list.addAtEnd(25);
        System.out.println("List before reversing:");
        list.displayFromStart();
        list.reverse();
        System.out.println("List after reversing:");
        list.displayFromStart();

        System.out.println("Total number of nodes: " + list.countNodes());
    }
}


