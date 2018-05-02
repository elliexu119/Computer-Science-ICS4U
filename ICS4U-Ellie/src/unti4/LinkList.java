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

    @Override
    public int size() {
        int counter = 0;
        Node n = head;
            for (; n != null && n.getNext() != null; n = n.getNext(), counter++) {
            }
            return counter;
    }

    @Override
    public boolean makeEmpty() {
        head = null;
        return true; 
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
        String string = "toString \n";
        Node n = head;
        for (; n.getNext() != null; n = n.getNext()) {
            string = string + n.getValue() + " ";
        }
        return string;
    }

    @Override
    public boolean remove(String str) {
        Node value = head;
        boolean foundIt = false;
            for (; value != null && value.getNext() != null; value = value.getNext()) {
                if (value.getNext().getValue() == str) {
                    foundIt = true; 
                    break;
                }
            }
            if (foundIt == true){
                if (str == head.getValue()) {
                    removeHead();
                } else if (value.getNext() == tail) {
                    removeTail();
                } else {
                    value.setNext(value.getNext().getNext());
                }
                return true; 
            }
            else {
                return false; 
            }
    }

    @Override
    public String removeHead() {
        if (head != null) {
            String str = head.getValue();
            head = head.getNext();
            return str;
        } else {
            return "-1";
        }
    }

    @Override
    public String removeTail() {
        if (tail != null) {
            String str = tail.getValue();
            Node n = head;
            for (; n.getNext() != tail; n = n.getNext()) {
            }
            tail = n;
            return str;
        } else {
            return "-1";
        }
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
