package com.bridgelabz.linkedlist;

public class LinkedList<T extends Comparable > {
    Node<T> head;
    Node<T> tail;
    T temp;

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
        if (head == null) {
            System.out.println("Linked list is Empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != tail) {
                currentNode = currentNode.next;
            }
            currentNode.next = null;
            tail = currentNode;
        }
    }

    public Node<T> search(T data) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(data)) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }
    public void insertElement(T searchNode, T insertElement) {
        Node<T> newNode = new Node<>(insertElement);
        Node<T> searchedNode = search(searchNode);
        boolean condition = false;
        if (searchedNode != null){
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            condition = true;
        }
        if (condition==true){
            System.out.println("Successfully added the element");
        }else {
            System.out.println("Element Absent in Linked list");
        }
    }
    public void searchElementThenDelete(T data) {
        Node<T> secondLastNode = head;
        Node<T> lastNode = head.next;
        while (lastNode.data != data) {
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = lastNode.next;
    }


    public void ascendingOrder(){
        Node<T> currentNode = head, index;
        if (currentNode == null) {
            System.out.println("List is empty");
        }
        while (currentNode != null) {
            index = currentNode.next;
            while (index != null) {
                if (currentNode.data.compareTo(index.data)>0) {
                   T temp = currentNode.data;
                    currentNode.data=index.data;
                    index.data=temp;
                }
                index = index.next;
            }
            currentNode = currentNode.next;
        }

    }
}