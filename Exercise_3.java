/*
    Time Complexity = O(n) {for insert and printList methods}
    Space Complexity = O(1) {for insert and printList methods}
    Did this code successfully run on Leetcode : yes
 */

import java.io.*;
  
// Java program to implement 
// a Singly Linked List
//public class LinkedList {
class LinkedList {

  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            //Write your code here
            this.data = d;
            this.next = null;
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
   
        // If the Linked List is empty, 
        // then make the new node as head
        // Else traverse till the last node
        // and insert the new_node there

        // Insert the new_node at last node
        // Return the list by head

        Node node = new Node(data);
        if(list.head == null){
            list.head = node;
        }else{
            Node n = list.head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }

        return list;
        
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    {  
        // Traverse through the LinkedList 
   
            // Print the data at current node 
       
            // Go to next node

        if(list.head == null){
            System.out.println("Empty LinkedList");
        }else{
            Node n = list.head;
            while(n != null){
                System.out.println(n.data);
                n = n.next;
            }
        }


    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
  
        // Print the LinkedList 
        printList(list); 
    } 
}