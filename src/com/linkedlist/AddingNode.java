package com.linkedlist;

public class AddingNode {
    Linkedlist.Node head;
    static class Node {
        int value;
        Linkedlist.Node next;
        Node(int d) {
            value = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        Linkedlist linkedList = new Linkedlist();
        linkedList.head = new Linkedlist.Node(70);
        Linkedlist.Node second = new Linkedlist.Node(30);
        Linkedlist.Node third = new Linkedlist.Node(56);
        linkedList.head.next = second;
        second.next = third;
        System.out.print("LinkedList: ");
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}

