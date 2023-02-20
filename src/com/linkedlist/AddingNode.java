package com.linkedlist;

public class AddingNode {
    LinkedList.Node head;
    static class Node {
        int value;
        LinkedList.Node next;
        Node(int d) {
            value = d;
            next = null;
        }
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new LinkedList.Node(70);
        LinkedList.Node second = new LinkedList.Node(30);
        LinkedList.Node third = new LinkedList.Node(56);
        linkedList.head.next = second;
        second.next = third;
        System.out.print("LinkedList: ");
        while (linkedList.head != null) {
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}

