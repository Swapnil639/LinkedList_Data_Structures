package com.bridgelabz;

public class LinkedListMain<T> {
    public static void main(String[] args) {
        System.out.println("Welcome to Linked List Program");
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(70);
        linkedList.add(30);
        linkedList.add(56);
        linkedList.display();

        LinkedList<Integer> linkedList1=new LinkedList<>();
        linkedList1.append(56);
        linkedList1.append(30);
        linkedList1.append(70);
        linkedList1.display();

        linkedList1.firstElementDelete();
        linkedList1.display();




    }
}
