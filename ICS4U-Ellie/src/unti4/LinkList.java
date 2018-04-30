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
        string = string + node.getValue() + " " ;
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
        //node index -1 .setNext(node index +1); 
    }

    @Override
    public String removeHead() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String removeTail() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String head() {
        return this.head.getValue();
    }

    @Override
    public String tail() {
        return this.tail.getValue();
    }

}
