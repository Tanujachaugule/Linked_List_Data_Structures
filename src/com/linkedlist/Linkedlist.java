package com.linkedlist;

public class Linkedlist {
    Node head;
    static class Node {
        public int data;
        int value;
        Node next;
        Node(int d) {
            value = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        Linkedlist linkedList = new Linkedlist();
        linkedList.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);
        linkedList.head.next = second;
        second.next = third;
        System.out.print("LinkedList: ");
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}