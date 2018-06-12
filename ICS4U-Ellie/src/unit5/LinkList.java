/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

/**
 *
 * @author 1xuell
 */
public class LinkList implements LinkListInterface {

    Node head;
    Node tail;

    @Override
    public int size() {
        int counter = 1;
        if (head == null && tail == null) {
            return 0;
        }

        Node n = head;
        for (; n.getNext() != null; n = n.getNext(), counter++) {
        }
        return counter;
    }

    @Override
    public boolean makeEmpty() {
        head = null;
        tail = null;
        return true;
    }

    @Override
    public boolean isEmpty() {
        if (head == null && tail == null) {
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
        if (head == null && tail == null) {
            return string;
        }
        while (n.getNext() != null){
            string = n.getValue() + " " ;
            n = n. getNext(); 
        }
        return string;
    }

    @Override
    public boolean remove(String str) {
        Node value = head;
        boolean foundIt = false;
        if (head != null && head.getValue() == str) {
            foundIt = true;
        } else {
            for (; value != null && value.getNext() != tail.getNext(); value = value.getNext()) {
                if (value.getNext().getValue() == str) {
                    foundIt = true;
                    break;
                }
            }
        }

        if (foundIt == true) {
            if (str == head.getValue()) {
                System.out.println("REMOVE HEAD");
                removeHead();
            } else if (value.getNext() == tail) {
                System.out.println("REMOVE TAIL");
                removeTail();
            } else {
                value.setNext(value.getNext().getNext());
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String removeHead() {
        if (head != null) {
            String str = head.getValue();
            if (head == tail) {
                tail = null;
            }
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

            if (head == tail) {
                tail = null;
                head = null;
            } else {
                Node n = head;
                while (n.getNext().getNext() != null){
                    n = n.getNext();
                }
                tail = n;
                tail.setNext(null); 
            }
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
