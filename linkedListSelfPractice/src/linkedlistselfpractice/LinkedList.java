/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistselfpractice;

/**
 *
 * @author AustinGnanaraj
 */
public class LinkedList {

    Node first;
    Node Last;

    public LinkedList() {
        first = null;
        Last = null;
    }

    public void insert(String data) {
        Node node = new Node(data);
        if (first == null) {
            node.next = null;
            node.previous = null;
            first = node;
            Last = node;

        } else {
            node.next = null;
            node.previous = Last;
            Last.next = node;
            Last = node;

        }
    }

    public void insertFromStart(String data) {
        Node node = new Node(data);
        Node current = first;
        Node temp = null;
        while (current != null) {
            temp = current;
            current = current.next;
        }
        node.next = null;
        node.previous = temp;
        temp.next = node;
    }

    public void print() {
        Node current = first;
        String s = "";
        while (current != null) {
            s = s + " | " + current.data;
            current = current.next;
        }
        System.out.println("Linked List is " + s);
    }
}
