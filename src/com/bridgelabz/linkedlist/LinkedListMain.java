package com.bridgelabz.linkedlist;

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

        linkedList1.lastElementDelete();
        linkedList1.display();

        if ( linkedList1.search(30) == null){
            System.out.println("Element Absent in Linked list");
        }else {
            System.out.println("Element Present in Linked list");
        }

        linkedList.insertElement(30,40);
        linkedList.display();

        linkedList.searchElementThenDelete(30);
        linkedList.display();





    }
}
