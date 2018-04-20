/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unti4;

/**
 *
 * @author Wm.Muir
 */
public class Node implements NodeInterface{
    String data; 
    Node next;
    Node prev; 

    public Node(String data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public Node getNext() {
        return next; 
    }

    @Override
    public void setNext(Node newNode) {
        next = newNode; 
    }

    @Override
    public String getValue() {
        return data; 
    }
    

    
}
