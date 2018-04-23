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
        int size = 0;
        while (head.getNext()!= null){
            
        }
        return 0; 
    }

    @Override
    public void makeEmpty() {
        head = null; 
    }

    @Override
    public boolean isEmpty() {
        if (head == null){
            return true;
        }
        else {
            return false; 
        }
    }

    @Override
    public void addAtFront(String str) {
        if (isEmpty()){
            this.tail = new Node (str); 
            this.head = new Node (str); 
        }
        Node node = new Node (str);
        node.setNext(head);
        head = node; 
    }

    @Override
    public void addAtEnd(String str) {
        if (isEmpty()){
            this.tail = new Node (str); 
            this.head = new Node (str); 
        }
        Node node = new Node (str);
        node.setNext(tail);
        tail = node;
    }

    @Override
    public void remove(String str) {
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
