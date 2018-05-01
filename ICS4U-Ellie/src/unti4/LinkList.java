/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4;

/**
 *
 * @author 1xuell
 */
public class LinkList implements LinkListInterface {

    Node head;
    Node tail;
    private String string = "toString \n";

    @Override
    public int size() {
        return sizeR(head);
    }

    private int sizeR(Node node) {
        string = string + node.getValue() + " ";
        if (node.getNext() != tail.getNext()) {
            return sizeR(node.getNext()) + 1;
        }
        return 0;
    }

    @Override
    public void makeEmpty() {
        head = null;
    }

    @Override
    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void addAtFront(String str) {
        Node node = new Node(str);
        if (isEmpty()) {
            this.tail = node;
            this.head = node;
        } else {
            node.setNext(head);
            head = node;

        }
    }

    @Override
    public void addAtEnd(String str) {
        Node node = new Node(str);
        if (isEmpty()) {
            this.tail = node;
            this.head = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }

    @Override
    public String toString() {
        string = "toString \n";
        sizeR(head);
        return string;
    }

    @Override
    public void remove(String str) {
        //find 
        Node value = head;
        for (; value.getNext().getValue() != str && value.getNext() != null; value = value.getNext()) {
        }

        if (value.getNext() == null) {
            System.out.println("this node doesn't exist.");
        } else {
            if (str == head.getValue()) {
                removeHead();
            } else if (value.getNext() == tail) {
                removeTail();
            } else {
                value.setNext(value.getNext().getNext());
            }
        }
    }

    @Override
    public String removeHead() {
        String str = head.getValue();
        head = head.getNext();
        return str;
    }

    @Override
    public String removeTail() {
        String str = tail.getValue();
        Node n = head;
        for (; n.getNext() != tail; n = n.getNext()) {
        }
        tail = n;
        return str;
    }

    @Override
    public String head() {
        if (head == null) {
            return null;
        } else {
            return this.head.getValue();
        }
    }

    @Override
    public String tail() {
        if (tail == null) {
            return null;
        } else {
            return this.tail.getValue();
        }
    }

}
