package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T data) {
        Node<T> newNode=new Node<>(data);
        if (newNode==null){
            head=newNode;
            tail=newNode;
        }
        newNode.next=head;
        head=newNode;
    }

    public void display() {
       Node<T> currentNode=head;
       if (currentNode==null){
           System.out.println("Linked list is empty");
       }
       while (currentNode !=null){
           System.out.print(currentNode.data+" -> ");
           currentNode=currentNode.next;
       }

    }
}
