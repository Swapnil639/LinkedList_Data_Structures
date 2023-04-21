package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node<T> currentNode = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
        }
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    public void firstElementDelete() {
        if (head == null) {
            System.out.println("Linked list is Empty");
        }
        head = head.next;
    }

    public void lastElementDelete() {
        if (head == null){
            System.out.println("Linked list is Empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        }else {
            Node<T> currentNode = head;
            while (currentNode.next != tail){
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
        }
    }
}